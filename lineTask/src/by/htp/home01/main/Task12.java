package by.htp.home01.main;

/*
 * 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
 */

public class Task12 {

	public static void main(String[] args) {
		
		int x1;
		int y1;
		
		int x2;
		int y2;
		
		double z;
		
		x1 = 5;
		y1 = -2;
		
		x2 = -6;
		y2 = -3;
		
		z = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		
		System.out.println(z);
		
		
	}

}
