package by.htp.home01.main2;

/*
 * 19. Подсчитать количество положительных среди чисел а, b, с.
 */

public class Task19 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		int c = -6;

		int sum = 0;

		if (a > 0) {
			sum++;
		}
		if (b > 0) {
			sum++;
		}
		if (c > 0) {
			sum++;
		}

		System.out.println("Количесво положительных чисел = " + sum);

	}

}
