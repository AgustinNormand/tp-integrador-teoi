package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoWriteFloat extends NodoSentencia {
    private final NodoSentencia sentenciaWrite;
    private final NodoConstanteFloat nodoFloat;

    public NodoWriteFloat(float valor) {
        super(":=");
        this.sentenciaWrite = new NodoSentencia("WRITE");
        this.nodoFloat = new NodoConstanteFloat(valor);
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                sentenciaWrite.graficar(miId) +
                nodoFloat.graficar(miId);
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String assembler = "";
        assembler += tabs + "displayFloat " + nodoFloat.getId() + ",2\n";
        assembler += tabs + "newLine 1\n";
        return assembler;
    }
}
