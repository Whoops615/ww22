package by.htp.home01.main;

/*
 * 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

public class Task14 {

	public static void main(String[] args) {
		
		int radius;
		double area;
		double circumference;
		
		radius = 5;
		
		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;
		
		System.out.println("площать = " + area);
		System.out.println("Длинна окуружности = " + circumference);

	}

}
