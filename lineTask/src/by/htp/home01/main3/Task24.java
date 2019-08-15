package by.htp.home01.main3;

/*
 * 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
числом.
 */

public class Task24 {

	public static void main(String[] args) {

		
		int n = 123456789;
		int m = 0;
		int a = 0;
		int sum = 0;

		while (n > 0) {
			if (n % 10 % 2 == 0) {
				sum = sum + (n % 10);
			}
			a = n % 10;
			m = m * 10 + a;
			n = n / 10;
		}
		System.out.println("Сумма четных: " + sum);
		System.out.println("Перевернутое число: "+m);

	}

}
