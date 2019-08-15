package by.htp.home01.main3;

import java.util.Random;
import java.util.Scanner;

/*
 * 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя.
 */

public class Task31 {

	public static void main(String[] args) {

		Random rand = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число от 1 до 15 >>>");
		int x = sc.nextInt();
		int y = 0;
		int count = 0;

		for (int i = 1; i < 6; i++) {
			y = rand.nextInt(15);
			if (x == y) {
				System.out.println("Вы угадали: " + x);
			} else {
				System.out.println("Число компуктера: " + y);
				count++;
			}
		}
		if (count == 5) {
			System.out.println("Вы не угадали, ваше число: " + x);
		}

	}

}
