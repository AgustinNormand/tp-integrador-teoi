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

    ArrayList<Symbol> symbol_table = new ArrayList<>();

    public void process_match(String token_value, String lexema) {
        String statement = "Token " + token_value + " encontrado, Lexema " + lexema;

        switch (token_value) {
            case "CONST_INT":
                if (!valid_int(lexema))
                    statement = token_value + " que excede la cantidad permitida " + lexema;

            case "CONST_FLOAT":
                if (!valid_float(lexema))
                    statement = token_value + " que excede la cantidad permitida " + lexema;

            case "CONST_STRING":
                if (!valid_string(lexema))
                    statement = token_value + " que excede la cantidad permitida " + lexema;
        }

        symbol_table.add(new Symbol("TOKEN_NAME", token_value, "TOKEN_TYPE", lexema, 0));
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


