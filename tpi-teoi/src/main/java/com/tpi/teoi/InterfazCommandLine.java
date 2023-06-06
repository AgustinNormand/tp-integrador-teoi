package com.tpi.teoi;

import com.tpi.ast.NodoPrograma;
import dnl.utils.text.table.TextTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;

public class InterfazCommandLine {

    public static void main(String[] args) {
        String texto = "";
        try {
            File archivo = new File("input.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            while ((linea = br.readLine()) != null) {
                texto += linea + "\n";
            }
        } catch (Exception ex) {
        }

        Lexico Lexer = new Lexico(new StringReader(texto));
        parser sintactico = new parser(Lexer);

        NodoPrograma programa = null;
        try {
            programa = (NodoPrograma) sintactico.parse().value;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        FileWriter archivo = null;
        try {
            archivo = new FileWriter("arbol.dot");
            PrintWriter pw = new PrintWriter(archivo);
            pw.println(programa.graficar());
            archivo.close();

            String cmd = "/usr/bin/dot -Tpng arbol.dot -o arbol.png";
            Runtime.getRuntime().exec(cmd);

            Lexer.next_token();

            ArrayList<SymbolMe> symbols_table = Lexer.get_result();
            ArrayList<SymbolMe> lexemas_table = Lexer.get_result_lexemas();

            String assembler = programa.generarAssembler(symbols_table);
            FileWriter fileWriter = new FileWriter("final.asm");
            fileWriter.write(assembler);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}