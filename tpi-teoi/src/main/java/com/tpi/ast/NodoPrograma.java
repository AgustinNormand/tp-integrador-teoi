package com.tpi.ast;

import com.tpi.asm.CargarTS;
import com.tpi.asm.ConstanteDataASM;
import com.tpi.teoi.SymbolMe;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.BufferedReader;

public class NodoPrograma extends Nodo {
    private final List<NodoSentencia> sentencias;

    public NodoPrograma(List<NodoSentencia> sentencias) {
        super("PGM");
        this.sentencias = sentencias;
    }

    public String graficar() {
        // Acá se dispara la invocación a los métodos graficar() de los nodos.
        // Como un NodoPrograma no tiene padre, se inicia pasando null.
        return this.graficar(null);
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = "nodo_programa";

        StringBuilder resultado = new StringBuilder();
        resultado.append("graph G {");

        resultado.append(miId + " [label=\"Programa\"]\n");
        for (NodoSentencia sentencia : this.sentencias) {
            resultado.append(sentencia.graficar(miId));
        }

        resultado.append("}");

        return resultado.toString();
    }

    public String generarAssembler(ArrayList<SymbolMe> symbols_table) {
        StringBuilder assembler = new StringBuilder();
        StringBuilder data = new StringBuilder();

        // Genero el header inicial del assembler
        data.append("include macros2.asm\n"
                + "include number.asm\n"
                + "\n"
                + ".MODEL SMALL\n"
                + ".386\n"
                + ".STACK 200h\n\n");

        //data.append("MAXTEXTSIZE equ 50\n\n");

        // Genero el bloque de la tabla de simbolos
        data.append(".DATA\n");

        ConstanteDataASM.data = data;
        CargarTS cargarTS = new CargarTS(symbols_table);
        cargarTS.generarASM();

        String tabs = "\t";
        // Genero el bloque de código
        assembler.append(".CODE\n"
                + "start:\n"
                + tabs + "MOV EAX,@DATA\n"   //+ "MOV EAX,@DATA\n"
                + tabs + "MOV DS,EAX\n"      //+ "MOV DS,EAX\n"
                + tabs + "MOV ES,EAX\n");  //+ "MOV ES,EAX\n");

        assembler.append("\n");

        AtomicInteger auxCount = new AtomicInteger(1);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("sentencias_take", "no"); //Default value

        for (NodoSentencia sentencia : sentencias) {
            assembler.append(sentencia.generarAssembler(auxCount, symbols_table, tabs, parameters)).append("\n");
        }

        assembler.append(tabs + "MOV AX,4C00h\n"
                + tabs +"INT 21h\n");

        /*assembler.append(tabs + "; Modulos para manejo de STRINGS" + "\n");
        String nombreArchivo = "print_string.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                assembler.append(linea + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        assembler.append("END start;\n");

        data.append(assembler);

        return data.toString();
    }
}

