package com.tpi.teoi;
import java_cup.runtime.Symbol;
import java_cup.runtime.*; //para utilizar cup
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

LETRA                 = [a-zA-Z]
DIGITO                = [0-9]
PRIMER_NUMERO         = {DIGITO}|({SIG_MENOS}{DIGITO})
CARACTERES_ESPECIALES = {PUNTO}|{COMA}|{SIG_MENOS}
ID                    = {LETRA}({LETRA}|{DIGITO}|_)*
EspacioBlanco         = [ \t\f\r\n]
COMMENT_BEG           = "//*"
COMMENT_END           = "*//"
COMMENT               = {COMMENT_BEG}({LETRA}|{DIGITO}|{CARACTERES_ESPECIALES}|{EspacioBlanco})*{COMMENT_END}
/* */


/* Constantes y Tipos de datos */

CONST_INT    = ({PRIMER_NUMERO}{DIGITO}*)
CONST_STRING = {COM}({LETRA}|{DIGITO}|{EspacioBlanco}|{CARACTERES_ESPECIALES})*{COM}
CONST_FLOAT  = ({PRIMER_NUMERO}{DIGITO}*{PUNTO}{DIGITO}+)

TYPE_INT     = INT | int
TYPE_STRING  = STRING | string
TYPE_FLOAT   = FLOAT | float
/* */


/* Comparaciones */

AND      = and | AND
OR       = or | OR
MAYOR    = ">"
MAYOR_I  = ">="
MENOR    = "<"
MENOR_I  = "<="
IGUAL    = "==" | "="
DISTINTO = "<>"
/* */


/* Palabras reservadas */

DEC      = declare.section | DECLARE.SECTION
ENDDEC   = enddeclare.section | ENDDECLARE.SECTION
START    = program.section | PROGRAM.SECTION
FINALIZE = endprogram.section | ENDPROGRAM.SECTION
IF       = (I|i)(F|f)
WHILE    = (W|w)(H|h)(i|i)(L|l)(e|e)
TAKE     = (T|t)(A|a)(K|k)(E|e)
EXIT     = (W|w)(R|r)(I|i)(T|t)(E|e)
ELSE     = (E|e)(L|l)(S|s)(E|e)
/* */


/* Simbolos */

SIG_MENOS          = "-"
SIG_MAS            = "+"
SIG_DIV            = "/"
SIG_MUL            = "*"
COMA               = ","
PUNTO              = "."
PUNTO_Y_COMA       = ";"
COM                = \"
SQR_BRACKET_OPEN   = "["
SQR_BRACKET_CLOSE  = "]"
BRACKET_OPEN       = "("
BRACKET_CLOSE      = ")"
KEY_OPEN           = "{"
KEY_CLOSE          = "}"
OP_ASSIGN          = "::="
OP_DECLARE         = ":="
/* */

/* Bloque de inicializacion */
%{
	MatchProcessor mp = new MatchProcessor();
%}
/* */

/* Bloque de finalizacion */
%{
	public ArrayList<com.tpi.teoi.Symbol> get_result(){
	    return mp.get_result();
	}

	public ArrayList<String> get_rejected(){
    	    return mp.get_rejected();
    	}

    public ArrayList<com.tpi.teoi.Symbol> get_result_lexemas(){
	    return mp.get_result_lexemas();
	}	
    	
%}
/* */

%%

<YYINITIAL> {

{COMMENT}               {/* IGNORE */}

/* Constantes y Tipos de datos */

{CONST_INT}		        {mp.process_match("CONST_INT", yytext());
				return new Symbol(sym.CONST_INT,yytext();}

{CONST_STRING}        		{mp.process_match("CONST_STRING", yytext());
				return new Symbol(sym.CONST_STRING,yytext();}

{CONST_FLOAT}          		{mp.process_match("CONST_FLOAT", yytext());
				return new Symbol(sym.CONST_FLOAT,yytext();}

{TYPE_INT}             		{mp.process_match("TYPE_INT", yytext());
				return new Symbol(sym.TYPE_INT,yytext();}

{TYPE_STRING}           	{mp.process_match("TYPE_STRING", yytext());
				return new Symbol(sym.CONST_STRING,yytext();}

{TYPE_FLOAT}            	{mp.process_match("TYPE_FLOAT", yytext());
				return new Symbol(sym.CONST_FLOAT,yytext();}

/*  */

/* Comparaciones */

{AND}                   	{mp.process_match("AND", yytext());
				return new Symbol(sym.AND,yytext();}

{OR}                    	{mp.process_match("OR", yytext());
				return new Symbol(sym.OR,yytext();}

{MAYOR}                 	{mp.process_match("MAYOR", yytext());
				return new Symbol(sym.MAYOR,yytext();}

{MAYOR_I}               	{mp.process_match("MAYOR_I", yytext());
				return new Symbol(sym.MAYOR_I,yytext();}

{MENOR}                 	{mp.process_match("MENOR", yytext());
				return new Symbol(sym.MENOR,yytext();}

{MENOR_I}               	{mp.process_match("MENOR_I", yytext());
				return new Symbol(sym.MENOR_I,yytext();}

{IGUAL}                		{mp.process_match("IGUAL", yytext());
				return new Symbol(sym.IGUAL,yytext();}

{DISTINTO}              	{mp.process_match("DISTINTO", yytext());
				return new Symbol(sym.DISTINTO,yytext();}

/*  */

/* Palabras reservadas */

{DEC}		            	{mp.process_match("DEC", yytext());
				return new Symbol(sym.DEC,yytext();}

{ENDDEC}	        	{mp.process_match("ENDDEC", yytext());
				return new Symbol(sym.ENDDEC,yytext();}

{START}	            		{mp.process_match("START", yytext());
				return new Symbol(sym.START,yytext();}

{FINALIZE}	        	{mp.process_match("FINALIZE", yytext());
				return new Symbol(sym.FINALIZE,yytext();

{IF}	            		{mp.process_match("IF", yytext());
				return new Symbol(sym.IF,yytext();}

{WHILE}	            		{mp.process_match("WHILE", yytext());
				return new Symbol(sym.WHILE,yytext();}

{TAKE}		           	{mp.process_match("TAKE", yytext());
				return new Symbol(sym.TAKE,yytext();}

{EXIT}                  	{mp.process_match("EXIT", yytext());
				return new Symbol(sym.EXIT,yytext();}

{ELSE}                 		{mp.process_match("ELSE", yytext());
				return new Symbol(sym.ELSE,yytext();}

/*  */

/* Simbolos */

{SQR_BRACKET_OPEN}		{mp.process_match("SQR_BRACKET_OPEN", yytext());
				return new Symbol(sym.SQR_BRACKET_OPEN,yytext();}

{SQR_BRACKET_CLOSE}     	{mp.process_match("SQR_BRACKET_CLOSE", yytext());
				return new Symbol(sym.SQR_BRACKET_CLOSE,yytext();}

{BRACKET_OPEN}		   	{mp.process_match("BRACKET_OPEN", yytext());
				return new Symbol(sym.BRACKET_OPEN,yytext();}

{BRACKET_CLOSE}         	{mp.process_match("BRACKET_CLOSE", yytext());
				return new Symbol(sym.BRACKET_CLOSE,yytext();}

{KEY_OPEN}		        {mp.process_match("KEY_OPEN", yytext());
				return new Symbol(sym.KEY_OPEN,yytext();}

{KEY_CLOSE}             	{mp.process_match("KEY_CLOSE", yytext());
				return new Symbol(sym.KEY_CLOSE,yytext();}

{OP_ASSIGN}	        	{mp.process_match("OP_ASSIGN", yytext());
				return new Symbol(sym.OP_ASSIGN,yytext();}

{OP_DECLARE}	       		{mp.process_match("OP_DECLARE", yytext());
				return new Symbol(sym.OP_DECLARE,yytext();}

{COMA}                 		{mp.process_match("COMA", yytext());
				return new Symbol(sym.COMA,yytext();}

{PUNTO_Y_COMA}          	{mp.process_match("PUNTO_Y_COMA", yytext());
				return new Symbol(sym.PUNTO_Y_COMA,yytext();}
				

{EspacioBlanco}			{ /* ignore */ }

{SIG_MENOS}             	{mp.process_match("SIG_MENOS", yytext());
				return new Symbol(sym.SIG_MENOS,yytext();}}

{SIG_MAS}               	{mp.process_match("SIG_MAS", yytext());
				return new Symbol(sym.SIG_MAS,yytext();}}

{SIG_DIV}               	{mp.process_match("SIG_DIV", yytext());}
				return new Symbol(sym.SIG_DIV,yytext();}

{SIG_MUL}               	{mp.process_match("SIG_MUL", yytext());
				return new Symbol(sym.SIG_MUL,yytext();}}

/*  */

{ID}	            		{mp.process_match("ID", yytext());
				return new Symbol(sym.ID,yytext();}}

}

[^]		{ mp.process_unmatch(yytext(), String.valueOf(yyline)); }

