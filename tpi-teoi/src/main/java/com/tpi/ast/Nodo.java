package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Nodo {
    private String descripcion;

    private String id;

    public Nodo(String descripcion) {
        this.descripcion = descripcion;
    }

    protected String getIdNodo() {
        return "nodo_" + this.hashCode();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcionNodo() {
        return descripcion;
    }

    protected String graficar(String idPadre) {
        return String.format("%1$s [label=\"%2$s\"]\n%3$s -- %1$s\n", getIdNodo(), getDescripcionNodo(), idPadre);
    }
    public boolean soyHoja() {
        return false;
    }

    public String generarAssembler(AtomicInteger AuxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        return null;
    }

}