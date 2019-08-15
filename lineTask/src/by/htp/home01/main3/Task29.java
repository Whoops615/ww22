package by.htp.home01.main3;

/*
 * 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task29 {

	public static void main(String[] args) {
		
		int a = 123456;
		int b = 456712;
		int n = 0;
		int m = 0;
		int b1 = b;

		while (a > 0) {
			n = a % 10;
			a = (a - n) / 10;
			b1 = b;

			while (b1 > 0) {
				m = b1 % 10;
				b1 = (b1 - m) / 10;

				if (n == m) {
					System.out.println("Общее " + n);
				}
			}
		}
	}

}
