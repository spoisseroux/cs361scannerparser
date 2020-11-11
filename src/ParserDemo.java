public class ParserDemo {

	public static void main(String[] args) {

		// Change the path!
//		TokenStream tStream = new TokenStream("C:\\\\Users\\\\cscharff\\\\eclipse-workspace\\\\ScannerSolution\\\\src\\\\prog1.jay");
		
		TokenStream bStream = new TokenStream("src/prog4.jay");
		
//		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		ConcreteSyntax cSyntax = new ConcreteSyntax(bStream);
		
		Program p = cSyntax.program();
		System.out.println(p.display());
		
	}

}
