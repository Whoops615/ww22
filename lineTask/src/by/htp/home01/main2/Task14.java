package by.htp.home01.main2;

/*
 * 14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
прямоугольным.
 */

public class Task14 {

	public static void main(String[] args) {

		int a = 60;
		int b = 30;
		int c = 180 - a - b;
		int abc = a + b + c;

		if (abc <= 180 & c != 0 & b != 0 & a != 0) {
			System.out.println("Треугольник АВС существует");
			if (a == 90 | b == 90 | c == 90) {
				System.out.println("Треугольник АВС прямоугольный");
			}
		} else {
			System.out.println("Треугольник не существует");
		}

	}

}
