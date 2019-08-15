package by.htp.home01.main2;

/*
 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
началу координат.
 */

public class Task13 {

	public static void main(String[] args) {

		int x1 = 3;
		int y1 = 7;
		int x2 = -6;
		int y2 = -2;

		double a = Math.hypot(x1, y1);
		double b = Math.hypot(x2, y2);

		System.out.println(a);
		System.out.println(b);

		if (a < b) {
			System.out.println("Точка А ближе к началу координат");
		} else {
			System.out.println("Точка B ближе к началу координат");
		}

	}

}
