package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoWriteString extends NodoSentencia {
    private final NodoSentencia sentenciaWrite;
    private final NodoConstanteString nodoCte;

    public NodoWriteString(String valor) {
        super(":=");
        this.sentenciaWrite = new NodoSentencia("WRITE");
        this.nodoCte = new NodoConstanteString(valor);
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                sentenciaWrite.graficar(miId) +
                nodoCte.graficar(miId);
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String assembler = "";
        assembler += tabs + "displayString " + nodoCte.getId() + "\n";
        assembler += tabs + "newLine 1\n";
        return assembler;
    }
}
