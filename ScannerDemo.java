
/**
 * @author scharffc
 *
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\cscharff\\eclipse-workspace\\ScannerSolution\\src\\prog1.jay";
	private static int counter = 1;

	//local checker for eclipse
	// private static String file1= "src/prog1.jay";

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		Token tk = new Token();

		while (!ts.isEndofFile()) {
			//TODO TO BE COMPLETED (done)
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
