package by.htp.home01.main3;

import java.util.Scanner;

/*
 * 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
самого числа. m и n вводятся с клавиатуры.
 */

public class Task27 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(">>>");
		int m = sc.nextInt();
		int n = sc.nextInt();

		System.out.println("Числовой промежуток : от " + m + " до " + n);
		System.out.println("-----------------------");

		for (int i = m; i <= n; i++) {
			System.out.print(" делители " + i + ": ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println("\n-----------------------");
		}

	}

}
