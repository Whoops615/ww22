package by.htp.home01.main;

/*
 * 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
 */

public class Task26 {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 7;
		int angle = 50;
		
		double anglerad;
		double p;
		
		anglerad = Math.toRadians(angle);
		p = ((a * b) / 2) * Math.sin(anglerad);
		
		System.out.println("Площадь = " + p);

	}

}
