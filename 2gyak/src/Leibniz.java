
public class Leibniz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int darab = 4000;
		double pi = 0;
		int elojel = 1;
		
		for (int i = 1; i <= darab; i += 2) {
			pi += elojel * 1.0 / i;
			elojel *= -1;
		}
		
		System.out.println("Leibniz formula");
		System.out.println("Pi/4 értéke: "+pi);
		System.out.println("Pi értéke: " +pi*4);

	}

}
