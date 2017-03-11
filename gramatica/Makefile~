JFLEX 	= /home/usuario/Descargas/jflex/bin/jflex
CUP	= /home/usuario/Descargas/cup/java-cup-11b.jar

all:
	rm Lexer.java; $(JFLEX) tokens.lex; java -jar $(CUP) gramatica.cup; javac PruebaParser.java
