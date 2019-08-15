package by.htp.home01.main2;

import java.util.Scanner;

/*
 * 36. Вычислить значение функции:
 */

public class Task36 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите x: >>>");
		int x = sc.nextInt();
		double f;

		if (myMethod(x) == true) {
			f = x * x - 3 * x + 9;
		} else {
			f = (double) 1 / (x * x * x + 6);
		}

		System.out.println("Результат: " + f);

	}

	public static boolean myMethod(int x) {
		if (x <= 3) {
			return true;
		} else {
			return false;
		}
	}
}
