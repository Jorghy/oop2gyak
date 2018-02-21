
public class Wallis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Pi értéke Wallis formulával
		double pi = 1;
		int darab = 100000/2;
		
		for (int i = 1; i <= darab; i++) {
			pi *= (2.0 * i) / (2 * i - 1);
			pi *= (2.0 * i) / (2 * i + 1);
			
		}
		
		System.out.println("Wallis formula");
		System.out.println("A pi/2 értéke: "+pi);
		System.out.println("A pi értéke: "+pi * 2);
		
	}

}
