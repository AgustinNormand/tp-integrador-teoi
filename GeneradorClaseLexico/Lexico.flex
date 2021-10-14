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

SIG_MENOS = "-"
SIG_MAS = "+"
SIG_DIV = "/"
SIG_MUL = "*"
COMA = ","
PUNTO = "."
COM = \"

LETRA = [a-zA-Z]
DIGITO = [0-9]
PRIMER_NUMERO = {DIGITO}|({SIG_MENOS}{DIGITO})
CARACTERES_ESPECIALES = {PUNTO}|{COMA}|{SIG_MENOS}

CONST_STRING = {COM}({LETRA}|{DIGITO}|{EspacioBlanco}|{CARACTERES_ESPECIALES})*{COM}
CONST_INT = ({PRIMER_NUMERO}{DIGITO}*)
CONST_FLOAT = ({PRIMER_NUMERO}{DIGITO}*{PUNTO}{DIGITO}+)

TYPE_FLOAT = FLOAT | float
TYPE_INT = INT | int
TYPE_STRING = STRING | string



ID = {LETRA}({LETRA}|{DIGITO}|_)*

DEC = declare.section | DECLARE.SECTION
ENDDEC = enddeclare.section | ENDDECLARE.SECTION
START = program.section | PROGRAM.SECTION
FINALIZE = endprogram.section | ENDPROGRAM.SECTION
EXIT = write | WRITE

SQR_BRACKET_OPEN = "["
SQR_BRACKET_CLOSE = "]"
BRACKET_OPEN = "("
BRACKET_CLOSE = ")"
KEY_OPEN = "{"
KEY_CLOSE = "}"
OP_ASSIGN = "::="
OP_DECLARE = ":="

AND = and | AND
OR = or | OR
MAYOR = ">"
MAYOR_I = ">="
MENOR = "<"
MENOR_I = "<="
DISTINTO = "<>"
IGUAL = "==" | "="

EspacioBlanco = [ \t\f\r\n]
COMMENT_BEG = "//*"
COMMENT_END = "*//"
COMMENT = {COMMENT_BEG}({LETRA}|{DIGITO}|{CARACTERES_ESPECIALES}|{EspacioBlanco})*{COMMENT_END}


%%

<YYINITIAL> {

{COMMENT}       {/* IGNORE */}

{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}

{CONST_STRING}      {System.out.println("Token CONS_STRING, encontrado Lexema "+ yytext());}

{CONST_FLOAT}       {System.out.println("Token CONST_FLOAT, encontrado Lexema "+ yytext());}

{AND}       {System.out.println("Token AND, encontrado Lexema "+ yytext());}

{OR}       {System.out.println("Token OR, encontrado Lexema "+ yytext());}

{MAYOR}       {System.out.println("Token MAYOR, encontrado Lexema "+ yytext());}

{MAYOR_I}       {System.out.println("Token MAYOR_I, encontrado Lexema "+ yytext());}

{MENOR}       {System.out.println("Token MENOR, encontrado Lexema "+ yytext());}

{MENOR_I}       {System.out.println("Token MENOR_I, encontrado Lexema "+ yytext());}

{IGUAL}       {System.out.println("Token IGUAL, encontrado Lexema "+ yytext());}

{DISTINTO}       {System.out.println("Token DISTINTO, encontrado Lexema "+ yytext());}

{DEC}		{System.out.println("Token DEC, encontrado Lexema "+ yytext());}

{ENDDEC}		{System.out.println("Token ENDDEC, encontrado Lexema "+ yytext());}

{START}		{System.out.println("Token START, encontrado Lexema "+ yytext());}

{FINALIZE}		{System.out.println("Token FINALIZE, encontrado Lexema "+ yytext());}

{SQR_BRACKET_OPEN}		{System.out.println("Token SQR_BRACKET_OPEN, encontrado Lexema "+ yytext());}

{SQR_BRACKET_CLOSE}     {System.out.println("Token SQR_BRACKET_CLOSE, encontrado Lexema "+ yytext());}

{BRACKET_OPEN}		{System.out.println("Token BRACKET_OPEN, encontrado Lexema "+ yytext());}

{BRACKET_CLOSE}     {System.out.println("Token BRACKET_CLOSE, encontrado Lexema "+ yytext());}

{KEY_OPEN}		{System.out.println("Token KEY_OPEN, encontrado Lexema "+ yytext());}

{KEY_CLOSE}     {System.out.println("Token KEY_CLOSE, encontrado Lexema "+ yytext());}

{EXIT}     {System.out.println("Token EXIT, encontrado Lexema "+ yytext());}

{OP_ASSIGN}		{System.out.println("Token OP_ASSIGN encontrado, Lexema "+ yytext());}

{OP_DECLARE}		{System.out.println("Token OP_DECLARE encontrado, Lexema "+ yytext());}

{COMA}      {System.out.println("Token COMA encontrado, Lexema "+ yytext());}

{TYPE_FLOAT}      {System.out.println("Token TYPE_FLOAT encontrado, Lexema "+ yytext());}

{TYPE_STRING}      {System.out.println("Token TYPE_STRING encontrado, Lexema "+ yytext());}

{TYPE_INT}      {System.out.println("Token TYPE_INT encontrado, Lexema "+ yytext());}

{EspacioBlanco}			{ /* ignore */ }

{SIG_MENOS}     {System.out.println("Token SIG_MENOS encontrado, Lexema "+ yytext());}

{SIG_MAS}      {System.out.println("Token SIG_SUMA encontrado, Lexema "+ yytext());}

{SIG_DIV}       {System.out.println("Token SIG_DIV encontrado, Lexema "+ yytext());}

{SIG_MUL}       {System.out.println("Token SIG_MUL encontrado, Lexema "+ yytext());}

{ID}		{System.out.println("Token ID encontrado, Lexema "+ yytext());}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }
