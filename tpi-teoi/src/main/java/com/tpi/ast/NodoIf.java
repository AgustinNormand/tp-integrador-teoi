package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoIf extends NodoSentencia {
    private final NodoExpresionBooleana condicion;
    private final List<NodoSentencia> sentenciasThen;
    private final List<NodoSentencia> sentenciasElse;

    static int count = 0;

    protected int ifQ;

    public NodoIf(NodoExpresionBooleana condicion, List<NodoSentencia> sentenciasThen, List<NodoSentencia> sentenciasElse) {
        super("IF");
        this.condicion = condicion;
        this.sentenciasThen = sentenciasThen;
        this.sentenciasElse = sentenciasElse;
        this.count++;
        this.ifQ = count;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        // Grafica el nodo IF
        resultado.append(super.graficar(idPadre));

        // Grafica la condición colgando directamente del nodo IF
        resultado.append(condicion.graficar(miId));

        // Agrega un nodo ficticio THEN colgando del nodo IF
        Nodo nodoThen = new Nodo("Then");
        resultado.append(nodoThen.graficar(miId));

        // Grafica las sentencias asociadas al "then" colgando del nodo ficticio THEN
        String idNodoThen = nodoThen.getIdNodo();
        for (NodoSentencia sentencia: sentenciasThen) {
            resultado.append(sentencia.graficar(idNodoThen));
        }

        // Si hay sentencias asociadas al "else"...
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

        return resultado.toString();
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String assembler = "";
        String ifTabs = tabs + "\t";

        parameters.put("condition_for", "if");
        parameters.put("first_condition_or", "no"); //Default value
        parameters.put("if_or_while_id", String.valueOf(this.ifQ));
        assembler += tabs + "if_" + this.ifQ + ":\n";

        if (this.sentenciasElse == null)
            parameters.put("if_with_else", "no");
        else
            parameters.put("if_with_else", "yes");

        assembler += this.condicion.generarAssembler(auxCount, symbols_table, ifTabs, parameters);

        assembler += tabs + "then_part_" + this.ifQ + ":\n";
        for (NodoSentencia sentencia : this.sentenciasThen) {
            assembler += sentencia.generarAssembler(auxCount, symbols_table, ifTabs, parameters);
        }
        assembler += ifTabs + "jmp end_if_" + this.ifQ +"\n";
        if (this.sentenciasElse != null){
            assembler += tabs + "else_part_" + this.ifQ + ":\n";
            for (NodoSentencia sentencia : this.sentenciasElse) {
                assembler += sentencia.generarAssembler(auxCount, symbols_table, ifTabs, parameters);
            }
        }

        assembler += tabs + "end_if_" + this.ifQ +":\n";
        return assembler;
    }
}