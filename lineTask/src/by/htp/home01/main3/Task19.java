package by.htp.home01.main3;

/*
 * 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид:
 */

public class Task19 {

	public static void main(String[] args) {

		int n = 10;
		double e = 0.03;
		double a;
		double summa = 0;

		for (double i = 1; i < n; i++) {
			a = (1 / Math.pow(2, i) + (1 / Math.pow(3, i)));
			System.out.printf("%.3f  ", a);
			if (Math.abs(a) >= e) {
				summa = summa + a;
			}

		}
		System.out.println("\n-----------------------------------------------------------------");
		System.out.printf("%.3f  ", summa);

	}

}
