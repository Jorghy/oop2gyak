package oop2gyakhazi;

public class Pitagorasz {

	public static void main(String[] args) {
		int darab = 100;
		double d;
		/*
		int A[] = {};
		int B[] = {};
		int C[] = {};
		*/
		System.out.println("A Pitagoraszi számhármasok");
		System.out.println("A\tB\tC");
		
		for (int i = 1; i <= darab; i++) {
			for (int j = i; j <= darab; j++) {
				d= Math.sqrt(Math.pow(i, 2)+Math.pow(j, 2));
				if(d == (int) d) {
					System.out.println(i+"\t"+j+"\t"+d);
				}
			}
		}

	}

}
