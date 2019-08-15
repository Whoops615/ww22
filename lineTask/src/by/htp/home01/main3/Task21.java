package by.htp.home01.main3;

/*
 * 21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции: F(x) = x − sin(x)
 */

public class Task21 {

	public static void main(String[] args) {

		double F;
		double h = 1;
		
		System.out.println("  x   |   F");
		System.out.println("---------------");
		
		
		for (int x = 1; x < 7; x += h) {
			F = x - Math.sin(x);
			System.out.print("  " + x + "   |");
			System.out.printf("%.3f  ", F);
			System.out.println("\n---------------");
		}

	}

}
