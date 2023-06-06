package com.tpi.ast;


import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoAnd extends NodoExpresionBooleana {
    private final NodoExpresionBooleana izquierda;
    private final NodoExpresionBooleana derecha;

    public NodoAnd(NodoExpresionBooleana izquierda, NodoExpresionBooleana derecha) {
        super("AND");
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
        String assembler = "";

        assembler += this.izquierda.generarAssembler(auxCount, symbols_table, tabs, parameters);
        assembler += this.derecha.generarAssembler(auxCount, symbols_table, tabs, parameters);

        return assembler;
    }

}

