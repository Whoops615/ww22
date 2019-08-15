package by.htp.home01.main3;

import java.util.Scanner;

/*
 * 282. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.
 */

public class Task28 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double z;
		int end;

		do {
			System.out.println("Введите X +-*/ Y >>>");
			int x = sc.nextInt();
			char operator = sc.next().charAt(0);
			int y = sc.nextInt();

			switch (operator) {
			case '+':
				z = x + y;
				System.out.println("Результат : " + z);
				break;
			case '-':
				z = x - y;
				System.out.println("Результат : " + z);
				break;
			case '*':
				z = x * y;
				System.out.println("Результат : " + z);
				break;
			case '/':
				if (y != 0) {
					z = (double) x / y;
					System.out.println("Результат : " + z);
					break;
				} else {
					System.out.println("Нельзя делить на 0");
					break;
				}
			default:
				System.out.println("Введен не верный оператор!");
			}
			System.out.println("Если хотите завершить программу введите: 0");
			end = sc.nextInt();
		} while (end != 0);
		
		System.out.println("Программа завершена.");

	}

}
