package by.htp.home01.main2;

/*
 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */

public class Task07 {

	public static void main(String[] args) {

		int a = 10;
		int b = -13;
		int c = 19;
		int x = 5;

		int m;

		m = Math.abs(a * x * x + b * x + c);

		System.out.println("Модуль m = " + m);

	}

}
