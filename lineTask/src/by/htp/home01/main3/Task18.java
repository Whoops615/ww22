package by.htp.home01.main3;

/*
 * 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид:
 */

public class Task18 {

	public static void main(String[] args) {

		int n = 10;
		double e = 0.2;
		double a;
		double summa = 0;

		for (double i = 1; i < n; i++) {
			a = (Math.pow(-1, i - 1)) / i;
			System.out.printf("%.3f  ", a);
			if (Math.abs(a) >= e) {
				summa = summa + a;
			}

		}
		System.out.println("\n-----------------------------------------------------------------");
		System.out.printf("%.3f  ", summa);
	}

}
