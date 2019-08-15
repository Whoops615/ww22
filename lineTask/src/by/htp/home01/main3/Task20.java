package by.htp.home01.main3;

/*
 * 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид:
 */

public class Task20 {

	public static void main(String[] args) {

		int n = 10;
		double e = 0.006;
		double a;
		double summa = 0;

		for (double i = 1; i < n; i++) {
			a = 1 / ((3 * i - 2) * (3 * i + 1));
			System.out.printf("%.3f  ", a);
			if (Math.abs(a) >= e) {
				summa = summa + a;
			}

		}
		System.out.println("\n-----------------------------------------------------------------");
		System.out.printf("%.3f  ", summa);

	}

}
