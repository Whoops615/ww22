package by.htp.home01.main;

/*
 * 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Task10 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		double z;
		
		
		x = 30;
		y = 60;
		
		double radx = Math.toRadians(x);
		double rady = Math.toRadians(y);
		
		z = (Math.sin(radx) + Math.cos(rady)) / (Math.cos(radx) - Math.sin(rady)) * (Math.tan(radx) * Math.tan(rady));
		
		System.out.println(z);

	}

}
