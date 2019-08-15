package by.htp.home01.main;

/*
 * 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

public class Task36 {

	public static void main(String[] args) {

		int x = 584432;
		double a2 = 1;
		double a3 = 1;

		for (int a = x; a > 0; a /= 10) {

			int a1 = a % 10;

			if (a1 % 2 == 0) {
				a2 *= a1;
			} else {
				a3 *= a1;
			}
		}

		double a4 = a2 / a3;
		System.out.println(a4);
	}

}
