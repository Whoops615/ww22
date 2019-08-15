package by.htp.home01.main3;

/*
 * 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
 */

public class Task15 {

	public static void main(String[] args) {

		int sum = 1;

		for (int i = 1; i <= 10; i++) {
			sum = sum + (int) Math.pow(2, i);
		}

		System.out.println("Результат: " + sum);

	}

}
