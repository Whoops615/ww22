package by.htp.home01.main;

/*
 * 31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость
течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
 */

public class Task31 {

	public static void main(String[] args) {
		
		int v = 20;
		int v1 = 5;
		int t1 = 3;
		int t2 = 6;
		
		int s1;
		int s2;
		int s;
		
		s1 = v*t1;
		s2 = (v-v1)*t2;
		s = s1+s2;
		
		System.out.println("Расстояние = " + s + " километров");
		
		
		

	}

}
