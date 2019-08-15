package by.htp.home01.main;

/*
 * 40. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
 */

public class Task40 {

	public static void main(String[] args) {

		int x = 7;

		int y;
		int z;

		int x2;

		x2 = x * x;

		y = -2 * x + 3 * x2 - 4 * x2 * x;
		z = 1 + 2 * x + 3 * x2 + 4 * x2 * x;

		System.out.println(y);
		System.out.println(z);

	}

}
