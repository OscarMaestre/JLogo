 /* JFlex example: partial Java language lexer specification */
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
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


DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING

%%


<YYINITIAL> {
  /* literals */
  {DecIntegerLiteral}            { return symbol(sym.INTEGER_LITERAL); }

}

/* error fallback */
[^]                              { throw new Error("Illegal character <"+
                                                    yytext()+">"); }