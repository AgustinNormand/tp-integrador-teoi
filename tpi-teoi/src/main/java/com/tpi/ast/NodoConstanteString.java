package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoConstanteString extends NodoExpresion {
    private final String valor;

    public NodoConstanteString(String valor) {
        super("CTE");
        this.valor = valor.replace("\"", "\'");
        this.setId("_" + this.valor.replace("\'", "").replace(" ", ""));
    }

    @Override
    public boolean soyHoja() {
        return true;
    }

    @Override
    public String getDescripcionNodo() {
        return "CTE: " + valor;
    }

}
