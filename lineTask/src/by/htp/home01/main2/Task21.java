package by.htp.home01.main2;

import java.util.Scanner;

/*
 * 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В
зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */

public class Task21 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Кто ты: мальчик или девочка? Ведите Д или М");

		String x = sc.next();

		myMethod(x);

	}

	public static void myMethod(String x) {

		switch (x) {
		case "Д":
			System.out.println("Мне нравятся мальчики");
			break;

		case "М":
			System.out.println("Мне нравятся девочки");
			break;
		}
	}

}
