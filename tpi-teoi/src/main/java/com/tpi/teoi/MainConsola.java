package com.tpi.teoi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainConsola {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String pad = "/home/lucasldc/Documentos/git Proyecto TEOI/tp-integrador-teoi/prueba.txt";
		FileReader file = new FileReader(pad);
		Lexico auxLexico = new Lexico(file);
		
		parser sintaco = new parser(auxLexico);
		System.out.println("Titulo:");
		auxLexico.next_token();
		
		System.out.println(sintaco.getResultGcl());
		
		  parser parserObj = new parser(); 
		
		  /* Asigna el Scanner */ 
		  java_cup.runtime.Scanner miAnalizadorLexico = new Lexico(file); 
		  parserObj.setScanner(miAnalizadorLexico); 
		  try{ parserObj.parse(); 
		  }catch(Exception x){ 
		  System.out.println("Error fatal."); 
		  } 

}
}
