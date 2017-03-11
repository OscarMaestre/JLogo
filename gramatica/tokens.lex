import java_cup.runtime.*;

    /**
     */
     
%%

%class Lexer
%unicode
%cup
%line
%column


%{
 	StringBuffer string = new StringBuffer();

     private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
     }
     private Symbol symbol(int type, Object value) {
      	return new Symbol(type, yyline, yycolumn, value);
     }
%}

FinLinea 			= \r|\n|\r\n
SubeLapiz			=	"subelapiz"
BajaLapiz			= "bajalapiz"
Numero				= [1-9][0-9]*
GiraIzquierda	=	"giraizquierda"
GiraDerecha		=	"giraderecha"

%%

<YYINITIAL> {SubeLapiz} 			{	return symbol (sym.SUBELAPIZ); }
<YYINITIAL> {BajaLapiz} 			{	return symbol (sym.BAJALAPIZ); }
<YYINITIAL> {Numero} 			{	return symbol (sym.NUMERO); }
<YYINITIAL> {GiraIzquierda} 	{	return symbol (sym.GIRAIZQUIERDA); }
<YYINITIAL> {GiraDerecha} 		{	return symbol (sym.GIRADERECHA); }
<YYINITIAL> {FinLinea} 			{	return symbol (sym.FINLINEA); }