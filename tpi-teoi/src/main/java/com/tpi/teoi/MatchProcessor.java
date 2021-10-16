package com.tpi.teoi;

import java.util.ArrayList;

public class MatchProcessor {

    /* Longitud dada por la consigna */
    final int MAX_STRING = 30;

    /* 16 bits integer range -32768 to +32767. Only positives range 0 to +32767*/
    final int MIN_INT = 0;
    final int MAX_INT = 32767;

    /* 32 bits float range  to . Only positives range 0 to 65504*/
    final float MIN_FLOAT = 0;
    final float MAX_FLOAT = Float.MAX_VALUE;

    private int token_count = 0;

    ArrayList<Symbol> symbol_table = new ArrayList<>();

    public void process_match(String token_value, String lexema) {
        String statement = "Token " + token_value + " encontrado, Lexema " + lexema;

        token_count = token_count + 1;

        switch (token_value) {
            case "CONST_INT":
                if (!valid_int(lexema))
                    statement = token_value + " que excede la cantidad permitida " + lexema;
                else
                    symbol_table.add(new Symbol(String.valueOf(token_count), "_"+lexema, token_value, "---", lexema, "---"));
                break;

            case "CONST_FLOAT":
                if (!valid_float(lexema))
                    statement = token_value + " que excede la cantidad permitida " + lexema;
                else
                    symbol_table.add(new Symbol(String.valueOf(token_count), "_"+lexema, token_value, "---", lexema, "---"));
                break;

            case "CONST_STRING":
                if (!valid_string(lexema))
                    statement = token_value + " que excede la cantidad permitida " + lexema;
                else{
                    lexema = lexema.replaceAll("\"", "");
                    symbol_table.add(new Symbol(String.valueOf(token_count), "_"+lexema.replaceAll(" ", ""), token_value, "---", lexema, String.valueOf(lexema.length())));
                }
                break;

            case "ID":
                symbol_table.add(new Symbol(String.valueOf(token_count), lexema, token_value, "", "---", "---"));
                break;

            default:
                symbol_table.add(new Symbol(String.valueOf(token_count), "TOKEN_NAME", token_value, "---", lexema, "---"));
                break;
        }

        //System.out.println(statement);
    }

    public ArrayList<Symbol> get_result(){
        return symbol_table;
    }

    /* Verificacion tamaño tipos de datos */
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
        if (x.length() > MAX_STRING) {
            result = false;
        }
        return result;
    }
}


