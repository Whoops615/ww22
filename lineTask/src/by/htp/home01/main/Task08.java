package by.htp.home01.main;

/*
 * 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * 
 */

public class Task08 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double d;
		
		a = 4;
		b = 7;
		c = 2;
		
		d = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2*a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println(d);

	}

}
