package by.htp.home01.main2;

/*
 * 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */

public class Task22 {

	public static void main(String[] args) {

		int x = 46;
		int y = 47;

		int y1;

		if (x > y) {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else if (x < y) {

			y1 = x;
			x = y;
			y = y1;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else {
			System.out.println("Числа равны");
		}

	}

}
