package by.htp.home01.main2;

/*
 * 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
 */

public class Task26 {

	public static void main(String[] args) {

		int a = 27;
		int b = 93;
		int c = 42;

		int min = Math.min(Math.min(a, b), Math.min(b, c));
		int max = Math.max(Math.max(a, b), Math.max(b, c));

		System.out.println("Меньшее число: " + min);
		System.out.println("Большее число: " + max);

		int sum = min + max;

		System.out.println("Сумма: " + sum);

	}

}
