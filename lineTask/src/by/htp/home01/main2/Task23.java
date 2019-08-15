package by.htp.home01.main2;

import java.util.Scanner;

/*
 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
некорректные данные, то сообщить об этом.
 */

public class Task23 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число>>");
		int d = sc.nextInt();
		System.out.println("Введите месяц>>");
		int m = sc.nextInt();

		if ((d >= 1 & d <= 31) & (m >= 1 & m <= 12)) {
			System.out.println("День: " + d + " Месяц: " + m);
		} else {
			System.out.println("Данные введены не корректно");
		}

	}
}
