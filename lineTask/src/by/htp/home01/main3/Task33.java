package by.htp.home01.main3;

/*
 * 33. Найдите наибольшую цифру данного натурального числа.
 */

public class Task33 {

	public static void main(String[] args) {

		int a = 129345687;
		int n = 0;
		int big = 0;

		while (a > 0) {
			n = a % 10;
			a = (a - n) / 10;
			if (big < n) {
				big = n;
			}
		}
		System.out.println("Наибольшая цифра: " + big);

	}

}
