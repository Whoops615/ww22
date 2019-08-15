package by.htp.home01.main3;

/*
 * 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */

public class Task16 {

	public static void main(String[] args) {

		long result = 1;
		int sum = 1;

		for (int i = 1; i < 10; i++) {
			sum = sum + (i + 1);
			result = result * sum;
		}
		System.out.println("Результат: " + result);

	}

}
