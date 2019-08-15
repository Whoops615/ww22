package by.htp.home01.main3;

/*
 * 9. Найти сумму квадратов первых ста чисел.
 */

public class Task09 {

	public static void main(String[] args) {

		int summa = 0;

		for (int i = 1; i <= 100; i++) {
			summa += i * i;
		}

		System.out.println(summa);

	}

}
