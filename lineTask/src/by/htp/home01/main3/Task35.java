package by.htp.home01.main3;

/*
 * 35. Найдите количество четных цифр данного натурального числа.
 */

public class Task35 {

	public static void main(String[] args) {

		int a = 123446789;
		int n = 0;
		int count = 0;

		while (a > 0) {
			n = a % 10;
			a = (a - n) / 10;
			if (n % 2 == 0) {
				count++;
			}
		}
		System.out.println("Количество четных: " + count);

	}

}
