package by.htp.home01.main3;

import java.util.Scanner;

/*
 * 32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания.
 */

public class Task32 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку >>>");
		String s = sc.nextLine();
		System.out.println("Ваша строка: " + s);
		
		int x;
		int x1 = s.charAt(0);
		boolean check = false;

		if (x1 == 95 | (x1 >= 97 & x1 <= 122)) {

			for (int i = 1; i < s.length(); i++) {
				x = s.charAt(i);
				if (x == 99 | (x >= 97 & x <= 122) | (x >= 48 & x <= 57)) {
					check = true;
				} else {
					check = false;
					break;
				}
			}

		} else {
			System.out.println("Введены не допустимые символы!");
		}
		
		
		if (check == true) {
			System.out.println("Вы ввели все правильно!");
		}
	}
}
