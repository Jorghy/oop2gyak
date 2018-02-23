package oop2gyakhazi;

public class eszam {

	public static void main(String[] args) {
		int darab = 1000;
		double e = 0;
		
		for (int i = 0; i <= darab; i++) {
			double f = Fakt(i);
			e += 1.0/f;
		}
		System.out.println("Az Euler féle e szám: "+e);

	}
	public static double Fakt(int a) {
		double f = 1;
		for (int i = 1; i <= a; i++) {
			f *= i;
		}
		return f;
	}

}
