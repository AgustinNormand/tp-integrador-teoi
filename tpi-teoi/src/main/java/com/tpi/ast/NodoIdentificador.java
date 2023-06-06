package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoIdentificador extends NodoExpresion {
    private final String identificador;

    public NodoIdentificador(String identificador) {
        super("ID");
        this.identificador = identificador;
        this.setId("_" +identificador);
    }
    @Override
    public boolean soyHoja() {
        return true;
    }
    @Override
    public String getDescripcionNodo() {
        return "ID: " + identificador;
    }
}
