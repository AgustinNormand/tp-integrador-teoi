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

COMA = ","
LETRA = [a-zA-Z]
DIGITO = [0-9]
CARACTERES_ESPECIALES = "."

ID = {LETRA}({LETRA}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
ESPACIO = \t | \f
COM = \"
CONST_STRING = {COM}({LETRA}|{DIGITO}|{EspacioBlanco}|{CARACTERES_ESPECIALES})*{COM}

DEC = declare.section | DECLARE.SECTION
ENDDEC = enddeclare.section | ENDDECLARE.SECTION
START = program.section | PROGRAM.SECTION
FINALIZE = endprogram.section | ENDPROGRAM.SECTION
Print = print | PRINT

SQR_BRACKET_OPEN = "["
SQR_BRACKET_CLOSE = "]"

EspacioBlanco = [ \t\f\r\n]


%%

<YYINITIAL> {

{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}

{CONST_STRING}      {System.out.println("Token CONS_STRING, encontrado Lexema "+ yytext());}

{DEC}		{System.out.println("Token DEC, encontrado Lexema "+ yytext());}

{ENDDEC}		{System.out.println("Token ENDDEC, encontrado Lexema "+ yytext());}

{START}		{System.out.println("Token START, encontrado Lexema "+ yytext());}

{FINALIZE}		{System.out.println("Token FINALIZE, encontrado Lexema "+ yytext());}

{SQR_BRACKET_OPEN}		{System.out.println("Token SQR_BRACKET_OPEN, encontrado Lexema "+ yytext());}

{SQR_BRACKET_CLOSE}     {System.out.println("Token SQR_BRACKET_CLOSE, encontrado Lexema "+ yytext());}

{Print}     {System.out.println("Token Print, encontrado Lexema "+ yytext());}

":="		{System.out.println("Token ASIGN encontrado, Lexema "+ yytext());}

{COMA}      {System.out.println("Token COMA encontrado, Lexema "+ yytext());}

{EspacioBlanco}			{ /* ignore */ }

{ID}		{System.out.println("Token ID encontrado, Lexema "+ yytext());}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }
