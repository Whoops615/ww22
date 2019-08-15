package by.htp.home01.main2;

import java.util.Scanner;

/*
 * 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */

public class Task34 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите стоимость книг >>");
		int a = sc.nextInt();
		System.out.println("Введите деньги покупалетя >>");
		int b = sc.nextInt();
		int c;

		if (a > b) {
			c = a - b;
			System.out.println("Не хватает " + c);
		} else if (a < b) {
			c = b - a;
			System.out.println("Сдача " + c);
		} else {
			System.out.println("Держите книгу");
		}

	}

}
