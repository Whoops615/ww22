package by.htp.home01.main3;

/*
 * 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в
диапазоне от 1 до 99 включительно.
 */

public class Task05 {

	public static void main(String[] args) {

		int x = 1;
		int x1 = 0;

		while (x <= 99) {

			x = x + 2;
			x1 += x;
		}
		System.out.println(x1);

	}

}
