package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoConstante extends NodoExpresion {
    private final int valor;

    public NodoConstante(int valor) {
        super("CTE");
        this.valor = valor;
        this.setId("_" + valor);
    }

    @Override
    public boolean soyHoja() {
        return true;
    }

    @Override
    public String getDescripcionNodo() {
        return "CTE: " + Integer.toString(valor);
    }
}
