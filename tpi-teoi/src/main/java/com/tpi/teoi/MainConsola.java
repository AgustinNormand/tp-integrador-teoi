package com.tpi.teoi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainConsola {

	public static void main(String[] args) throws FileNotFoundException, Exception{
		FileReader f = new FileReader("/home/lucasldc/Documentos/git Proyecto TEOI/tp-integrador-teoi/prueba.txt");
		Lexico Lexer = new Lexico(f);
		parser sintactico = new parser(Lexer);
		sintactico.parse();
		
	}
}
