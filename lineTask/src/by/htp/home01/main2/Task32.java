package by.htp.home01.main2;

/*
 * 32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
положительной.
 */

public class Task32 {

	public static void main(String[] args) {

		int a = -5;
		int b = 6;
		int c = -3;

		int sum1 = a + b;
		int sum2 = a + c;
		int sum3 = b + c;

		if (sum1 > 0 || sum2 > 0 || sum3 > 0) {
			System.out.println("Является");
		} else {
			System.out.println("Не является");
		}

	}

}
