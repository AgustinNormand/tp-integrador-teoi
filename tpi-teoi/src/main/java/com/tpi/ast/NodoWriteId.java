package com.tpi.ast;

import com.tpi.teoi.SymbolMe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class NodoWriteId extends NodoSentencia {
    private final NodoIdentificador nodoCte;

    public NodoWriteId(String valor) {
        super("WRITE");
        this.nodoCte = new NodoIdentificador(valor);
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                nodoCte.graficar(miId);
    }

    @Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table, String tabs, Map<String, String> parameters) {
        String type = "";
        String variableName = nodoCte.getId().replace("_", "");
        for (SymbolMe s : symbols_table) {
            if (s.getName().equals(variableName)) {
                type = s.getType();
            }
        }

        String assembler = "";
        if (type.equals("STRING")) {
            assembler += tabs + ";MOV DX, OFFSET " + nodoCte.getId() + "\n";
            assembler += tabs + ";MOV AH, 9\n";
            assembler += tabs + ";INT 21h\n";
        }
        if (type.equals("INT")) {
            //assembler += tabs + "DisplayInteger " + nodoCte.getId() + "\n";
            assembler += tabs + "DisplayFloat " + nodoCte.getId() + ",2\n";
            assembler += tabs + "newLine 1\n";
        }
        if (type.equals("FLOAT")) {
            assembler += tabs + "DisplayFloat " + nodoCte.getId() + ",2\n";
            assembler += tabs + "newLine 1\n";
        }


        return assembler;

    }

    /*
    Pending to support
    [variableString] := [STRING]
    variableString ::= "Desde Assembler"
    write variableString
     */


    /*@Override
    public String generarAssembler(AtomicInteger auxCount, ArrayList<SymbolMe> symbols_table) {
        String assembler = "";
        assembler += "MOV DX,OFFSET _DesdeAssembler\n";
        assembler += "MOV AH,9\n";
        assembler += "INT 21h\n";
        return assembler;
    }*/
}
