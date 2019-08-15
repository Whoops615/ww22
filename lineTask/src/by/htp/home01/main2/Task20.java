package by.htp.home01.main2;

/*
 * 20. Определить, делителем каких чисел а, b, с является число k
 */

public class Task20 {

	public static void main(String[] args) {

		double a = 10;
		double b = 11;
		double c = 12;

		int k = 2;

		myMethod(a, k);
		myMethod(b, k);
		myMethod(c, k);

	}

	public static void myMethod(double a, int k) {

		if ((a / k) * 10 % 10 == 0) {
			System.out.println("Число " + k + " является делителем числа " + a);
		} else {
			System.out.println("Число " + k + " не является делителем числа " + a);
		}
	}

}