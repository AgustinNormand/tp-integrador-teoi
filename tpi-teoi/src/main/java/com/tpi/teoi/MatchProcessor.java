package com.tpi.teoi;

import java.io.IOException;
import java.util.ArrayList;

public class MatchProcessor {
	
	/*
	 * Upgrade: la lista "symbol_table" ahora solo almacena CONST/ID,
	 * y la lista "lexems_table" almacena todos los lexemas/token.  
	 */

    /* Longitud dada por la consigna */
    final int MAX_STRING = 30;

    /* 16 bits integer range -32768 to +32767. Only positives range 0 to +32767*/
    final int MIN_INT = 0;
    final int MAX_INT = 32767;

    /* 32 bits float range  to . Only positives range 0 to 65504*/
    final float MIN_FLOAT = 0;
    final float MAX_FLOAT = Float.MAX_VALUE;

    private int token_count = 0;
    
    ArrayList<String> types = new ArrayList<>();

    ArrayList<SymbolMe> symbol_table = new ArrayList<>();
    
    ArrayList<String> rejected_statements = new ArrayList<>();
    
    /* Lista que almacena todos los Lexemas y Tokens */ 
    ArrayList<SymbolMe> lexems_table = new ArrayList<>();
    
    boolean declare_section = true;


    public void process_match(String token_value, String lexema) throws IOException {
        token_count = token_count + 1; //FIX-ME
        

        switch (token_value) {
            case "CONST_INT":
                if (!valid_int(lexema))
                    throw new IOException("Token número "+token_count+" rechazado. "+ token_value +" inválida ("+lexema+")\n");

                else{
                    process_new_constant(new SymbolMe(String.valueOf(token_count), "_"+lexema, token_value, "---", lexema, "---"));
                    //symbol_table.add(new SymbolMe(String.valueOf(token_count), "_"+lexema, token_value, "---", lexema, "---"));
                    lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
                }
                break;

            case "CONST_FLOAT":
                if (!valid_float(lexema))
                    throw new IOException("Token número "+token_count+" rechazado. "+ token_value +" inválida ("+lexema+")\n");
                else{
                    process_new_constant(new SymbolMe(String.valueOf(token_count), "_"+lexema, token_value, "---", lexema, "---"));
                    //symbol_table.add(new SymbolMe(String.valueOf(token_count), "_"+lexema, token_value, "---", lexema, "---"));
                    lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
                }
                break;

            case "CONST_STRING":
                if (!valid_string(lexema))
                    throw new IOException("Token número "+token_count+" rechazado. "+ token_value +" inválida ("+lexema+"). Longitud: ("+lexema.replaceAll("\"", "").length()+").\n");
                else{
                    lexema = lexema.replaceAll("\"", "");
                    process_new_constant(new SymbolMe(String.valueOf(token_count), "_"+lexema.replaceAll(" ", ""), token_value, "---", lexema, String.valueOf(lexema.length())));
                    //symbol_table.add(new SymbolMe(String.valueOf(token_count), "_"+lexema.replaceAll(" ", ""), token_value, "---", lexema, String.valueOf(lexema.length())));
                    lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
                }
                break;

            case "ID":
                process_new_id(String.valueOf(token_count), lexema, token_value, "TYPE", "---", "---");
                lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
            break;
            
            case "TYPE_INT":
            	types.add(lexema);
            	lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
                break;
                
            case "TYPE_FLOAT":
            	types.add(lexema);
            	lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
                break;
                
            case "TYPE_STRING":
            	types.add(lexema);
            	lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
            break;
            
            case "ENDDEC":
            	declare_section = false;
            	process_types();
            	lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
            break;

            default: 
            	lexems_table.add(new SymbolMe(String.valueOf(token_count), "", token_value, "", lexema, ""));
            break;  
        }
    }

    public void process_unmatch(String yytext, String yyline) throws java.io.IOException {
        throw new IOException("Caracter rechazado ("+ yytext + ")\n");
    }

    private boolean valid_int(String x) {
        boolean result = true;
        try {
            int i = Integer.parseInt(x);
            if (i < MIN_INT || i > MAX_INT)
                result = false;
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    private boolean valid_float(String x) {
        boolean result = true;
        try {
            float f = Float.parseFloat(x);
            if (f < MIN_FLOAT || f > MAX_FLOAT) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    private boolean valid_string(String x) {
        boolean result = true;
        x = x.replaceAll("\"", "");
        if (x.length() > MAX_STRING) {
            result = false;
        }
        return result;
    }
    
    private void process_types(){
    	for (SymbolMe sym : symbol_table) {
    		if (sym.getToken() == "ID" && types.size() > 0) {
    			sym.setType(types.get(0));
    			types.remove(0);
    		}
    	}
    }

    private void process_new_constant(SymbolMe symbolMe) {
        Boolean found = false;
        for (SymbolMe sym : symbol_table){
            if (sym.getName().toUpperCase().equals(symbolMe.getName().toUpperCase())) {
                found = true;
                break;
            }
        }
        if (!found){
            symbol_table.add(symbolMe);
        }
    }

    private void process_new_id(String token_count, String lexema, String token_value, String type, String string3, String string4) throws IOException {
        Boolean found = false;
        for (SymbolMe sym : symbol_table){
            if (sym.getToken() == "ID") {
                if (sym.getName().toUpperCase().equals(lexema.toUpperCase())) {
                    found = true;
                    break;
                }
            }
        }
        if (!found)
            if(declare_section)
    	        symbol_table.add(new SymbolMe(token_count, lexema, token_value, "UNDECLARED", "---", "---"));
            else
                throw new IOException("ID utilizado no declarado: "+lexema);
    }

    public ArrayList<SymbolMe> get_result(){
        return symbol_table;
    }

    public ArrayList<String> get_rejected(){
        return rejected_statements;
    }
    
    public ArrayList<SymbolMe> get_result_lexemas(){
        return lexems_table;
    }
}
