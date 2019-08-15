package by.htp.home01.main3;

/*
 * 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
цифры.
 */

public class Task40 {

	public static void main(String[] args) {

		int n = 100;
		int c = 0;
		int j;
		boolean rez = false;

		for (int i = 1; i <= n; i++) {
			j = i;
			while (j > 0) {
				c = j % 10;
				j = (j - c) / 10;
				if (c == 0) {
					rez = false;
					break;
				} else if (i % c != 0) {
					rez = false;
					break;
				} else {
					rez = true;
				}
			}
			if (rez == true) {
				System.out.print(i + " ");
			}
		}

	}

}
