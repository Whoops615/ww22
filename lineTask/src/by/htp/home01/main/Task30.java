package by.htp.home01.main;

/*
 * 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
 */

public class Task30 {

	public static void main(String[] args) {
		
		double r1 = 10;
		double r2 = 4;
		double r3 = 7;
		
		double r;
		
		r = (r1*r2*r3) / (r1+r2+r3);
		
		System.out.println("Сопротивление = " + r);

	}

}
