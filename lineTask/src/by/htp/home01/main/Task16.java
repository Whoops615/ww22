package by.htp.home01.main;

/*
 * 16. Найти произведение цифр заданного четырехзначного числа.
 */

public class Task16 {

	public static void main(String[] args) {

		int a = 5674;

		int a1 = a % 10;
		int a2 = a % 100 / 10;
		int a3 = a % 1000 / 100;
		int a4 = a % 10000 / 1000;

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

		int a5;
		
		a5 = a1 * a2 * a3 * a4;

		System.out.println(a5);

	}

}
