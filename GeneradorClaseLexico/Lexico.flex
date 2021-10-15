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

/* Declaraciones basicas */

LETRA = [a-zA-Z]
DIGITO = [0-9]
PRIMER_NUMERO = {DIGITO}|({SIG_MENOS}{DIGITO})
CARACTERES_ESPECIALES = {PUNTO}|{COMA}|{SIG_MENOS}
ID = {LETRA}({LETRA}|{DIGITO}|_)*
EspacioBlanco = [ \t\f\r\n]
COMMENT_BEG = "//*"
COMMENT_END = "*//"
COMMENT = {COMMENT_BEG}({LETRA}|{DIGITO}|{CARACTERES_ESPECIALES}|{EspacioBlanco})*{COMMENT_END}
/* */


/* Constantes y Tipos de datos */

CONST_INT = ({PRIMER_NUMERO}{DIGITO}*)
CONST_STRING = {COM}({LETRA}|{DIGITO}|{EspacioBlanco}|{CARACTERES_ESPECIALES})*{COM}
CONST_FLOAT = ({PRIMER_NUMERO}{DIGITO}*{PUNTO}{DIGITO}+)

TYPE_INT = INT | int
TYPE_STRING = STRING | string
TYPE_FLOAT = FLOAT | float
/* */


/* Comparaciones */

AND = and | AND
OR = or | OR
MAYOR = ">"
MAYOR_I = ">="
MENOR = "<"
MENOR_I = "<="
IGUAL = "==" | "="
DISTINTO = "<>"
/* */


/* Palabras reservadas */

DEC = declare.section | DECLARE.SECTION
ENDDEC = enddeclare.section | ENDDECLARE.SECTION
START = program.section | PROGRAM.SECTION
FINALIZE = endprogram.section | ENDPROGRAM.SECTION
IF = if | IF
WHILE = while | WHILE
TAKE = take | TAKE
EXIT = write | WRITE
ELSE = else | ELSE
/* */


/* Simbolos */

SIG_MENOS = "-"
SIG_MAS = "+"
SIG_DIV = "/"
SIG_MUL = "*"
COMA = ","
PUNTO = "."
PUNTO_Y_COMA = ";"
COM = \"
SQR_BRACKET_OPEN = "["
SQR_BRACKET_CLOSE = "]"
BRACKET_OPEN = "("
BRACKET_CLOSE = ")"
KEY_OPEN = "{"
KEY_CLOSE = "}"
OP_ASSIGN = "::="
OP_DECLARE = ":="
/* */

/* Bloque de inicializacion */
%{
    /* Longitud dada por la consigna */
	final int MAX_STRING = 30;

	/* 16 bits integer range -32768 to +32767. Only positives range 0 to +32767*/
	final int MIN_INT = 0;
	final int MAX_INT = 32767;

    /* 32 bits float range  to . Only positives range 0 to 65504*/
	final float MIN_FLOAT = 0;
	final float MAX_FLOAT = Float.MAX_VALUE;

%}


/* Verificacion tamaño tipos de datos */
%{
    private boolean verify_float(String x) {
        boolean result = true;
        try {
    	    float f = Float.parseFloat(x);
    	    if (f < MIN_FLOAT || f > MAX_FLOAT) {
        		result = false;
        	}
        }catch (Exception e) {
            result = false;
        }
       	return result;
    }

    private boolean verify_int(String x) {
        boolean result = true;
        try {
    		int i = Integer.parseInt(x);
    		if (i < MIN_INT || i > MAX_INT)
    		    result = false;
    	}catch (Exception e) {
    	    result = false;
    	}
    	return result;
    }

    private boolean verify_string(String x) {
        boolean result = true;
        if (x.length() > MAX_STRING) {
    	    result = false;
    	}
    	return result;
    }
%}

/* */

%%

<YYINITIAL> {

{COMMENT}       {/* IGNORE */}

/* Constantes y Tipos de datos */

{CONST_INT}		{boolean valid_int = verify_int(yytext());
                 if (valid_int) System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());
                 else System.out.println("CONST_INT que excede la cantidad permitida "+ yytext());
                }

{CONST_STRING}      {boolean valid_string = verify_string(yytext());
                     if (valid_string) System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());
                     else System.out.println("CONST_STRING que excede la cantidad permitida "+ yytext());
                    }

{CONST_FLOAT}       {boolean valid_float = verify_float(yytext());
                     if (valid_float) System.out.println("Token CONST_FLOAT, encontrado Lexema "+ yytext());
                     else System.out.println("CONST_FLOAT que excede la cantidad permitida "+ yytext());
                    }

{TYPE_INT}      {System.out.println("Token TYPE_INT encontrado, Lexema "+ yytext());}

{TYPE_STRING}      {System.out.println("Token TYPE_STRING encontrado, Lexema "+ yytext());}

{TYPE_FLOAT}      {System.out.println("Token TYPE_FLOAT encontrado, Lexema "+ yytext());}

/*  */

/* Comparaciones */

{AND}       {System.out.println("Token AND, encontrado Lexema "+ yytext());}

{OR}       {System.out.println("Token OR, encontrado Lexema "+ yytext());}

{MAYOR}       {System.out.println("Token MAYOR, encontrado Lexema "+ yytext());}

{MAYOR_I}       {System.out.println("Token MAYOR_I, encontrado Lexema "+ yytext());}

{MENOR}       {System.out.println("Token MENOR, encontrado Lexema "+ yytext());}

{MENOR_I}       {System.out.println("Token MENOR_I, encontrado Lexema "+ yytext());}

{IGUAL}       {System.out.println("Token IGUAL, encontrado Lexema "+ yytext());}

{DISTINTO}       {System.out.println("Token DISTINTO, encontrado Lexema "+ yytext());}

/*  */

/* Palabras reservadas */

{DEC}		{System.out.println("Token DEC, encontrado Lexema "+ yytext());}

{ENDDEC}		{System.out.println("Token ENDDEC, encontrado Lexema "+ yytext());}

{START}		{System.out.println("Token START, encontrado Lexema "+ yytext());}

{FINALIZE}		{System.out.println("Token FINALIZE, encontrado Lexema "+ yytext());}

{IF}		{System.out.println("Token IF, encontrado Lexema "+ yytext());}

{WHILE}		{System.out.println("Token WHILE, encontrado Lexema "+ yytext());}

{TAKE}		{System.out.println("Token TAKE, encontrado Lexema "+ yytext());}

{EXIT}     {System.out.println("Token EXIT, encontrado Lexema "+ yytext());}

{ELSE}     {System.out.println("Token ELSE, encontrado Lexema "+ yytext());}

/*  */

/* Simbolos */

{SQR_BRACKET_OPEN}		{System.out.println("Token SQR_BRACKET_OPEN, encontrado Lexema "+ yytext());}

{SQR_BRACKET_CLOSE}     {System.out.println("Token SQR_BRACKET_CLOSE, encontrado Lexema "+ yytext());}

{BRACKET_OPEN}		{System.out.println("Token BRACKET_OPEN, encontrado Lexema "+ yytext());}

{BRACKET_CLOSE}     {System.out.println("Token BRACKET_CLOSE, encontrado Lexema "+ yytext());}

{KEY_OPEN}		{System.out.println("Token KEY_OPEN, encontrado Lexema "+ yytext());}

{KEY_CLOSE}     {System.out.println("Token KEY_CLOSE, encontrado Lexema "+ yytext());}

{OP_ASSIGN}		{System.out.println("Token OP_ASSIGN encontrado, Lexema "+ yytext());}

{OP_DECLARE}		{System.out.println("Token OP_DECLARE encontrado, Lexema "+ yytext());}

{COMA}      {System.out.println("Token COMA encontrado, Lexema "+ yytext());}

{PUNTO_Y_COMA}      {System.out.println("Token PUNTO_Y_COMA encontrado, Lexema "+ yytext());}

{EspacioBlanco}			{ /* ignore */ }

{SIG_MENOS}     {System.out.println("Token SIG_MENOS encontrado, Lexema "+ yytext());}

{SIG_MAS}      {System.out.println("Token SIG_SUMA encontrado, Lexema "+ yytext());}

{SIG_DIV}       {System.out.println("Token SIG_DIV encontrado, Lexema "+ yytext());}

{SIG_MUL}       {System.out.println("Token SIG_MUL encontrado, Lexema "+ yytext());}

/*  */

{ID}		{System.out.println("Token ID encontrado, Lexema "+ yytext());}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }
