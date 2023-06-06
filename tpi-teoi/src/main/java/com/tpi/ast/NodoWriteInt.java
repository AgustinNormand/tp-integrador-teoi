package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoWriteInt extends NodoSentencia {
    private final NodoConstante nodoCte;

    public NodoWriteInt(Integer valor) {
        super("WRITE");
        this.nodoCte = new NodoConstante(valor);
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                nodoCte.graficar(miId);
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String assembler = "";
        //assembler += tabs + "displayInteger " + nodoCte.getId() + "\n";
        assembler += tabs + "displayFloat " + nodoCte.getId() + ",2\n";
        assembler += tabs + "newLine 1\n";
        return assembler;
    }
}
