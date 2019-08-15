package by.htp.home01.main;

/*
 * 1. Даны два действительных числа х и у. Вычислить их сумму, разность, и частное.
 */

public class Task01 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x = 10;
		y = 7;
		
		int z1 = x + y;
		int z2 = x - y;
		int z3 = x * y;
		double z4 = (double)x / y;
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);

	}

}
