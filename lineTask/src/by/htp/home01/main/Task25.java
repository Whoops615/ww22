package by.htp.home01.main;

/*
 * 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
что а≠0 и что дискриминант уравнения неотрицателен).
 */

public class Task25 {

	public static void main(String[] args) {

		int a = 4;
		int b = 12;
		int c = 5;

		double d;
		double x1;
		double x2;

		d = b * b - 4 * a * c;
		x1 = (-b + Math.sqrt(d)) / (2 * a);
		x2 = (-b - Math.sqrt(d)) / (2 * a);

		System.out.println(x1);
		System.out.println(x2);

	}

}
