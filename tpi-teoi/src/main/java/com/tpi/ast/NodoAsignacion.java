package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoAsignacion extends NodoSentencia {
    private final NodoIdentificador identificador;
    private final NodoExpresion expresion;

    public NodoAsignacion(NodoIdentificador identificador, NodoExpresion expresion) {
        super(":=");
        this.identificador = identificador;
        this.expresion = expresion;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                identificador.graficar(miId) +
                expresion.graficar(miId);
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String assembler = "";

        if (!expresion.soyHoja()){
            assembler += expresion.generarAssembler(auxCount, symbols_table, tabs, parameters);
        }

        String variableName = identificador.getId().replace("_","");
        String type = "";
        for (SymbolMe s : symbols_table) {
            if (s.getName().equals(variableName)){
                type = s.getType();
            }
        }

        if (type.equals("STRING")){
            assembler += tabs + ";MOV si, OFFSET " + expresion.getId() + "\n";
            assembler += tabs + ";MOV di, OFFSET " + identificador.getId() + "\n";
            assembler += tabs + ";CALL COPIAR\n";
        } else {
            assembler += tabs + "fld " + expresion.getId() + "\n";
            assembler += tabs + "fstp " + identificador.getId() + "\n";
        }


        return assembler;
    }

}
