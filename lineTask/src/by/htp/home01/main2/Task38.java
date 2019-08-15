package by.htp.home01.main2;

import java.util.Scanner;

/*
 * 38. Вычислить значение функции:
 */

public class Task38 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите x: >>>");
		int x = sc.nextInt();
		double f;

		if (myMethod(x) == true) {
			f = x * x;
		} else {
			f = 4;
		}

		System.out.println("Результат: " + f);

	}

	public static boolean myMethod(int x) {
		if (x >= 0 & x <= 3) {
			return true;
		} else {
			return false;
		}
	}

}
