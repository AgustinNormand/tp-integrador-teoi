package com.tpi.ast;

import com.tpi.asm.ConstanteDataASM;
import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoResta extends NodoExpresionBinaria {
    NodoExpresion izquierda;
    NodoExpresion derecha;

    private static int count = 0;
    private final int restaQ;
    public NodoResta(NodoExpresion izquierda, NodoExpresion derecha) {
        super("-", izquierda, derecha);
        this.izquierda = izquierda;
        this.derecha = derecha;
        count++;
        this.restaQ = count;
        this.setId("_@RESTA" + this.restaQ);
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        ConstanteDataASM.data.append(this.getId()).append(" dd, ?\n");

        String assembler = "";

        if (!this.izquierda.soyHoja()){
            assembler += this.izquierda.generarAssembler(auxCount, symbols_table, tabs, parameters);
        }

        if (!this.derecha.soyHoja()){
            assembler += this.derecha.generarAssembler(auxCount, symbols_table, tabs, parameters);
        }

        assembler += tabs + "fld " + this.izquierda.getId() + "\n";
        assembler += tabs + "fld " + this.derecha.getId() + "\n";
        assembler += tabs + "fsub\n";
        assembler += tabs + "fstp " + this.getId() + "\n";
        assembler += "\n";
        return assembler;
    }
}