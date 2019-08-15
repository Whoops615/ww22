package by.htp.home01.main3;

/*
 * 7. Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task07 {

	public static void main(String[] args) {

		int a = -2;
		int b = 6;
		int h = 1;

		int y;
		System.out.println("|  x    |" + "|  y   |");
		System.out.println("------------------");

		for (int x = a; x < b; x += h) {
			if (x > 2) {
				y = x;
				System.out.println("|  " + x + "   |" + "|  " + y + "  |");
				System.out.println("------------------");
			} else {
				y = -x;
				System.out.println("|  " + x + "   |" + "|  " + y + "  |");
				System.out.println("------------------");
			}
		}

	}

}
