package com.tpi.teoi;

import java.util.ArrayList;

import java_cup.runtime.Symbol;

public class MatchProcessorSintactico {

	ArrayList<String> aux = new ArrayList<String>();
	
	
	
	
	public void addString(String s) {
		aux.add(s + " //  \n");
		
	}
	
	public String  toString() {
		return aux.toString();
		
	}
}
