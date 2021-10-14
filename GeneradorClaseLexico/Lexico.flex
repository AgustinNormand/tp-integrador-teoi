package com.tpi.teoi;
import java_cup.runtime.Symbol;
import java_cup.runtime.*;
import java.util.*;
import jflex.sym;


%%


/*%cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char


LETRA = [a-zA-Z]
DIGITO = [0-9]
ESPACIO = \t|\f
ID = {LETRA}({LETRA}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
COM = \"
CONST_STRING = {COM}({LETRA}|{DIGITO}|{ESPACIO})*{COM}

EspacioBlanco = [ \t\f\r\n]


%%

<YYINITIAL> {

{ID}		{System.out.println("Token ID encontrado, Lexema "+ yytext());}

{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}

":="		{System.out.println("Token ASIGN encontrado, Lexema "+ yytext());}

{EspacioBlanco}			{ /* ignore */ }

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }
