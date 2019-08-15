package by.htp.home01.main;

/*
 * 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за
три операции и а10 за четыре операции.
 */

public class Task27 {

	public static void main(String[] args) {

		int a = 3;

		int a8;
		int a10;
		int a2;

		a2 = a * a;
		a8 = a2 * a2;
		a8 = a8 * a8;

		a2 = a * a;
		a10 = a2 * a2;
		a10 = a10 * a10;
		a10 = a10 * a2;

		System.out.println("а в 8 степени = " + a8);
		System.out.println("a в 10 степени = " + a10);

	}

}
