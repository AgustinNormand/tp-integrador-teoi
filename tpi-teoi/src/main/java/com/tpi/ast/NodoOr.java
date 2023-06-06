package com.tpi.ast;


import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoOr extends NodoExpresionBooleana {
private final NodoExpresionBooleana izquierda;
private final NodoExpresionBooleana derecha;

public NodoOr (NodoExpresionBooleana izquierda, NodoExpresionBooleana derecha) {
        super("OR");
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

@Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                izquierda.graficar(miId) +
                derecha.graficar(miId);
    }


    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String if_or_while_id = parameters.get("if_or_while_id");
        String assembler = "";

        parameters.put("first_condition_or", "yes");

        assembler += this.izquierda.generarAssembler(auxCount, symbols_table, tabs, parameters);

        parameters.put("first_condition_or", "no");

        assembler += this.derecha.generarAssembler(auxCount, symbols_table, tabs, parameters);

        return assembler;
    }

}