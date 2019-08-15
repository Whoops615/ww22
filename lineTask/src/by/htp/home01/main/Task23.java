package by.htp.home01.main;

/*
 * 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
 */

public class Task23 {

	public static void main(String[] args) {
		
		int r1 = 25;
		int r2 = 29;
		
		double s1;
		double s2;
		double s;
		
		s1 = Math.PI * r1 * r1;
		s2 = Math.PI * r2 * r2;
		s = s2 - s1;
		
		System.out.println("Площадь кольца = " + s);

	}

}
