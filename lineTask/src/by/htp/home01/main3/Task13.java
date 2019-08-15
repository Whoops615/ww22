package by.htp.home01.main3;

/*
 * 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
 */

public class Task13 {

	public static void main(String[] args) {

		double h = 0.5;
		double y;

		System.out.println("    x    |    y    ");
		System.out.println("-----------------");

		for (double x = -5; x <= 5; x += h) {
			y = 5 - (x * x) / 2;
			System.out.println("  " + x + "   |  " + y + "  ");
			System.out.println("-----------------");
		}

	}

}
