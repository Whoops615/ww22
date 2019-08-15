package by.htp.home01.main3;

/*
 * 11. Составить программу нахождения разности кубов первых двухсот чисел
 */

public class Task11 {

	public static void main(String[] args) {

		int result = 1;

		for (int i = 2; i <= 200; i++) {
			result = result - (i * i * i);
		}
		System.out.println("Результат: " + result);

	}

}
