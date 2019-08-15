package by.htp.home01.main3;

import java.util.Scanner;

/*
 * 25. Требуется определить факториал числа, которое ввел пользователь.
 */

public class Task25 {

	public static void main(String[] args) {

		System.out.println("Введите число >>>");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.print(">>>");
		}

		int x = sc.nextInt();

		System.out.println("Число: " + x);
		long fact = 1;

		if (x == 0 || x == 1) {
			System.out.println("Факториал: " + 1);
		} else if (x > 1 & x < 21) {
			for (int i = 1; i <= x; i++) {
				fact = fact * i;
			}
			System.out.println("Факториал: " + fact);
		} else {
			System.out.println(
					"Java не считает такие большие числа без специальных Классов, запустите заново и введите число до 20");
		}

	}

}
