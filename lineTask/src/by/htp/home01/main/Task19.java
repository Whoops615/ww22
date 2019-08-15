package by.htp.home01.main;

/*
 * 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
и описанной окружностей.
 */

public class Task19 {

	public static void main(String[] args) {
		
		int a = 7;
		
		double s;
		double h;
		double r;
		double r2;
		
		s = (Math.pow(a, 2) * Math.sqrt(3) / 4);
		h = (a * Math.sqrt(3)) / 2;
		r = (a * Math.sqrt(3)) / 6;
		r2 = r * 2;
		
		System.out.println("Площать = " + s);
		System.out.println("Высота = " + h);
		System.out.println("Радиус вписанной окружности = " + r);
		System.out.println("Радиус описанной окружности = " + r2);

	}

}
