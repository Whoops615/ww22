package by.htp.home01.main;

/*
 * 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
 */

public class Task11 {

	public static void main(String[] args) {

		double a;
		double b;

		double c;
		double pl;
		double pr;

		a = 3;
		b = 9;

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		pr = a + b + c;
		pl = (a * b) / 2;
		
		System.out.println("Периметр треугольника = " + pr);
		System.out.println("Площадь треугольника = " + pl);

	}

}
