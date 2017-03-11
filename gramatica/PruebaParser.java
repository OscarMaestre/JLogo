import java.io.StringReader;

import jdk.nashorn.internal.parser.Parser;


public class PruebaParser {

	public static void main(String[] args) {
		StringReader reader=new StringReader("subelapiz\n");
		Lexer lexer=new Lexer(reader);
		parser el_parser=new parser(lexer);
		try{
			el_parser.parse();
		} catch (Exception e){
			e.printStackTrace();
			return ;
		}
		System.out.println("Fichero valido");
		
	}

}
