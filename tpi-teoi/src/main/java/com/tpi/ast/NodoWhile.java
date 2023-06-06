package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoWhile extends NodoSentencia {
    private final NodoExpresionBooleana condicion;
    private final List<NodoSentencia> cuerpo;

    static int count = 0;

    protected int whileQ;
    public NodoWhile(NodoExpresionBooleana condicion, List<NodoSentencia> cuerpo) {
        super("WHILE");
        this.condicion = condicion;
        this.cuerpo = cuerpo;
        this.count++;
        this.whileQ = count;

    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        // Grafica el nodo IF
        resultado.append(super.graficar(idPadre));

        // Grafica la condición colgando directamente del nodo CUERPO
        resultado.append(condicion.graficar(miId));

        // Agrega un nodo ficticio CUERPO colgando del nodo WHILE
        Nodo nodoThen = new Nodo("Cuerpo");
        resultado.append(nodoThen.graficar(miId));

        // Grafica las sentencias asociadas al "then" colgando del nodo ficticio THEN
        String idNodoThen = nodoThen.getIdNodo();
        for (NodoSentencia sentencia: cuerpo) {
            resultado.append(sentencia.graficar(idNodoThen));
        }

        /* Si hay sentencias asociadas al "else"...
        if (sentenciasElse != null) {
            // Agrega un nodo ficticio "ELSE" colgando del nodo IF
            Nodo nodoElse = new Nodo("Else");
            resultado.append(nodoElse.graficar(miId));

            // Grafica las sentencias asociadas al "else" colgando del nodo ficticio ELSE
            String idNodoElse = nodoElse.getIdNodo();
            for (NodoSentencia sentencia: sentenciasElse) {
                resultado.append(sentencia.graficar(idNodoElse));
            }
        }
*/
        return resultado.toString();
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String assembler = "";
        String whileTabs = tabs + "\t";

        parameters.put("condition_for", "while");
        parameters.put("first_condition_or", "no"); //Default value
        parameters.put("if_or_while_id", String.valueOf(this.whileQ));
        assembler += "while_" + this.whileQ + ":\n";

        assembler += this.condicion.generarAssembler(auxCount, symbols_table, whileTabs, parameters);

        assembler += "cuerpo_while_" + this.whileQ + ":\n";
        for (NodoSentencia sentencia : this.cuerpo) {
            assembler += sentencia.generarAssembler(auxCount, symbols_table, whileTabs, parameters);
        }
        assembler += "jmp while_" + this.whileQ + "\n";
        assembler += "end_while_" + this.whileQ + ":\n";

        return assembler;
    }
}

