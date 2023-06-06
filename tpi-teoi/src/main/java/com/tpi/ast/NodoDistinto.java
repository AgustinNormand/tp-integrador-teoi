package com.tpi.ast;


import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoDistinto extends NodoComparacion {
    NodoExpresion izquierda;
    NodoExpresion derecha;


    public NodoDistinto(NodoExpresion izquierda, NodoExpresion derecha) {
        super("<>", izquierda, derecha);
        this.izquierda = izquierda;
        this.derecha = derecha;
    }


    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String if_or_while_id = parameters.get("if_or_while_id");
        String assembler = "";

        assembler += tabs + "fld " + derecha.getId() + "\n";
        assembler += tabs + "fld " + izquierda.getId() + "\n";
        assembler += tabs + "fcomp\n";
        assembler += tabs + "fstsw ax\n";
        assembler += tabs + "sahf\n";

        if (parameters.get("first_condition_or").equals("yes")) {
            String jump_label = "";

            if (parameters.get("condition_for").equals("if"))
                jump_label += "then_part_";

            if (parameters.get("condition_for").equals("while"))
                jump_label += "cuerpo_while_";

            assembler += tabs + "jne " + jump_label + if_or_while_id + "\n";
        }

        if (parameters.get("first_condition_or").equals("no")) {
            String jump_label = "";

            if (parameters.get("condition_for").equals("if"))
                if (parameters.get("if_with_else").equals("yes"))
                    jump_label = "else_part_";
                else
                    jump_label = "end_if_";

            if (parameters.get("condition_for").equals("while"))
                jump_label = "end_while_";

            assembler += tabs + "je " + jump_label + if_or_while_id + "\n";

        }
        return assembler;
    }
}