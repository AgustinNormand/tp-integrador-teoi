package com.tpi.ast;

import com.tpi.asm.ConstanteDataASM;
import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoTake extends NodoExpresion {
    private final List<NodoSentencia> sentenciasTake;
    public NodoTake(List<NodoSentencia> sentenciasTake) {
        super("TAKE");
        this.sentenciasTake = sentenciasTake;
        this.setId("_resultado");
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        resultado.append(super.graficar(idPadre));

        for (NodoSentencia sentencia: sentenciasTake) {
            resultado.append(sentencia.graficar(miId));
        }

        return resultado.toString();
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        if (ConstanteDataASM.data.indexOf("_contador") == -1)
            ConstanteDataASM.data.append("_contador").append(" dd, ?\n"); // Esto hay que hacerlo mejor, con @

        if (ConstanteDataASM.data.indexOf("_resultado") == -1)
            ConstanteDataASM.data.append("_resultado").append(" dd, ?\n"); // Esto hay que hacerlo mejor, con @

        if (ConstanteDataASM.data.indexOf("_0") == -1)
            ConstanteDataASM.data.append("_0").append(" dd, 0.0\n");

        if (ConstanteDataASM.data.indexOf("_1") == -1)
            ConstanteDataASM.data.append("_1").append(" dd, 1.0\n");

        String assembler = "";

        parameters.put("sentencias_take", "yes");

        for (NodoSentencia sentencia: sentenciasTake) {
            assembler += sentencia.generarAssembler(auxCount, symbols_table, tabs, parameters);
        }


        //assembler += tabs + "fld _resultado\n";
        //assembler += tabs + "fld " + this.derecha.getId() + "\n";
        //assembler += tabs + "fadd\n";
        //assembler += tabs + "fstp " + this.getId() + "\n";
        //assembler += "\n";
        return assembler;
    }

}
