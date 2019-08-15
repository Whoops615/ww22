package by.htp.home01.main3;

/*
 * 8. Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task08 {

	public static void main(String[] args) {

		int a = 12;
		int b = 18;
		int c = 4;
		int h = 1;

		int y;
		System.out.println("|  x    |" + "|  y   |");
		System.out.println("------------------");

		for (int x = a; x < b; x += h) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("|  " + x + "   |" + "|  " + y + "  |");
				System.out.println("------------------");
			} else {
				y = (x - c) + 6;
				System.out.println("|  " + x + "   |" + "|  " + y + "  |");
				System.out.println("------------------");
			}
		}

	}

}
