package by.htp.home01.main;

/*
 * 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
 */

public class Task35 {

	public static void main(String[] args) {

		int m = 150;
		int n = 7;

		double k;
		int s;
		int s2;

		k = (double) m / n;
		s = (int) k % 10;
		s2 = (int) (k * 10 % 10);

		System.out.println(k);
		System.out.println(s);
		System.out.println(s2);

	}

}
