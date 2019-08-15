package by.htp.home01.main;

/*
 * 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
 */

public class Task13 {

	public static void main(String[] args) {

		int x1;
		int y1;

		int x2;
		int y2;

		int x3;
		int y3;

		double a;
		double b;
		double c;
		double pr;
		double pl;
		double p;

		x1 = 8;
		y1 = 3;

		x2 = 4;
		y2 = -1;

		x3 = 6;
		y3 = -4;

		a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow(y1 - y3, 2));
		c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow(y3 - y2, 2));
		pr = a + b + c;
		p = pr / 2;
		pl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Периметр треугольника = " + pr);
		System.out.println("Площадь треугольника = " + pl);
		
	}

}
