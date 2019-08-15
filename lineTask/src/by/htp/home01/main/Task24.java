package by.htp.home01.main;

/*
 * 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
 */

public class Task24 {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 8;
		int angle = 70;
		
		double s;
		
		double anglerad = Math.toRadians(angle);
		
		s = ((a*a - b*b) / 2 ) * Math.tan(anglerad);
		
		System.out.println("Площадь = " + s);

	}

}
