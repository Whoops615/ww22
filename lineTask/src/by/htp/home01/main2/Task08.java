package by.htp.home01.main2;

/*
 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

public class Task08 {

	public static void main(String[] args) {

		int a = 78;
		int b = 43;

		int a1;
		int b1;

		a1 = a * a;
		b1 = b * b;

		if (a1 > b1) {
			System.out.println("Квардрат числа " + a + " больше квадрата числа " + b);
		} else {
			System.out.println("Квадрат числа " + b + " больше квадрата числа " + a);
		}

	}

}
