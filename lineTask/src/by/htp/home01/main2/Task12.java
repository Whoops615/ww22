package by.htp.home01.main2;

/*
 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую
степень — отрицательные.
 */

public class Task12 {

	public static void main(String[] args) {

		double a = 2;
		double b = -3;
		double c = -4;

		myMethod(a);
		myMethod(b);
		myMethod(c);

	}

	public static void myMethod(double a) {

		if (a > 0) {
			System.out.println(a * a);
		} else {
			System.out.println(Math.pow(a, 4));
		}

	}

}
