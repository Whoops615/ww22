package by.htp.home01.main2;

/*
 * 6. Составить программу: определения наибольшего из двух чисел а и b
 */

public class Task06 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 9;
		b = 4;

		if (a > b) {
			System.out.println("Наибольшее: " + a);
		} else if (a < b) {
			System.out.println("Наибольшее: " + b);
		} else {
			System.out.println("Равны");
		}

	}

}
