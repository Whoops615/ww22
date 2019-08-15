package by.htp.home01.main;

/*
 * 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */

public class Task18 {

	public static void main(String[] args) {
		
		int a = 3;
		
		double s1;
		double s2;
		double v;
		
		s1 = Math.pow(a, 2);
		s2 = s1 * 6;
		v = Math.pow(a, 3);
		
		System.out.println("Площадь грани = " + s1);
		System.out.println("Площадь всей поверхности = " + s2);
		System.out.println("Обьем = " + v);
		
	}

}
