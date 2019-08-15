package by.htp.home01.main2;

/*
 * 18. Подсчитать количество отрицательных среди чисел а, b, с.
 */

public class Task18 {

	public static void main(String[] args) {

		int a = -3;
		int b = 4;
		int c = -1;

		int sum = 0;

		if (a < 0) {
			sum++;
		}
		if (b < 0) {
			sum++;
		}
		if (c < 0) {
			sum++;
		}

		System.out.println("Количество отрицательных = " + sum);

	}

}
