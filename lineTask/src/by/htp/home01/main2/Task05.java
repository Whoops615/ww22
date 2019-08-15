package by.htp.home01.main2;

/*
 * 5. Составить программу: определения наименьшего из двух чисел а и b.
 */

public class Task05 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 19;
		b = 9;

		if (a < b) {
			System.out.println("Наименьшее: " + a);
		} else if (a > b) {
			System.out.println("Наименьшее: " + b);
		} else {
			System.out.println("Равны");
		}

	}

}
