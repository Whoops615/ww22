package by.htp.home01.main;

/*
 * 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */

public class Task20 {

	public static void main(String[] args) {
		
		int c = 30;
		
		double r;
		double s;
		
		r = c / (2 * Math.PI);
		s = Math.PI * r * r;
		
		System.out.println("Площадь = " + s);
		
		

	}

}
