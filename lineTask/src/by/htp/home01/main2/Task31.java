package by.htp.home01.main2;

/*
 * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */

public class Task31 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int x = 2;
		int y = 3;
		int z = 4;

		double diagonal;

		diagonal = Math.sqrt(x * x + y * y + z * z);

		if (diagonal < a & diagonal < b) {
			System.out.println("Кирпич пролезет");
		} else {
			System.out.println("Кирпич не пролезет");
		}

	}

}
