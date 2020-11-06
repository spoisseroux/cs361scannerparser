public class ParserDemo {

	public static void main(String[] args) {

		// Change the path!
		TokenStream tStream = new TokenStream("C:\\\\Users\\\\cscharff\\\\eclipse-workspace\\\\ScannerSolution\\\\src\\\\prog1.jay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
		//TODO (See me) I added this - A
		/*
		 * I think we have to print it a specific way
		 * (check Blackboard)
		 */
	}

}
