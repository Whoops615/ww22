package by.htp.home01.main2;

/*
 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их
суммы, а большее — их удвоенным произведением.
 */

public class Task15 {

	public static void main(String[] args) {

		int x = 8;
		int y = 6;

		if (x < y) {
			x = (x + y) / 2;
			y = (x * y) * 2;
			System.out.println(x);
			System.out.println(y);
		} else {
			y = (x + y) / 2;
			x = (x * y) * 2;
			System.out.println(x);
			System.out.println(y);
		}

	}

}
