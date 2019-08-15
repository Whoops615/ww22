package by.htp.home01.main;

/*
 * 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */

public class Task17 {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 13;
		
		double sa;
		double sg;
		
		sa = (Math.pow(a, 3) + Math.pow(b, 3) / 2);
		sg = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифмитическое = " + sa);
		System.out.println("Среднее геометрическое = " + sg);

	}

}
