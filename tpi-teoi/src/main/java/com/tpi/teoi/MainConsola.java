package com.tpi.teoi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainConsola {

	public static void main(String[] args) throws FileNotFoundException, Exception{
		/*FileReader f = new FileReader("C:\\Users\\real2\\Desktop\\Coding TPparte2\\tp-integrador-teoi\\prueba.txt");
		Lexico Lexer = new Lexico(f);
		parser sintactico = new parser(Lexer);
		sintactico.parse();
		System.out.println("aparte---");
		
		for (int i = 0; i < sintactico.listaReglas.size(); i++) {
		System.out.println(sintactico.listaReglas.get(i) + "\n" );
		}*/
		
		try {
			FileReader f = new FileReader("/home/lucasldc/Documentos/git Proyecto TEOI/tp-integrador-teoi/prueba.txt");
			Lexico Lexer = new Lexico(f);
			parser sintactico = new parser(Lexer);
			sintactico.parse();
		} catch (Exception e) {
			System.out.println("se genero un erro fatal");
			e.printStackTrace();
		}
	}
}
