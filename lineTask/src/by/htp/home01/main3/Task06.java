package by.htp.home01.main3;

import java.util.Scanner;

/*
 * 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое положительное число >>");
		int x;

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(">>>");
		}
		x = sc.nextInt();
		if (x > 0) {
			System.out.println("Число: " + x);
		} else {
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println(">>>");
			}
		}

		int summa = 0;

		for (int i = 1; i < x; i++) {
			summa += i;

		}
		System.out.println("Сумма: " + summa);

	}

}
