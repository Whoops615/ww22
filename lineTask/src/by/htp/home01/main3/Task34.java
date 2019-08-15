package by.htp.home01.main3;

/*
 * 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */

public class Task34 {

	public static void main(String[] args) {

		int sum = 0;
		int j = 0;
		int n = 0;

		for (int i = 1000; i < 10000; i++) {
			j = i;
			sum = 0;
			
			while (j > 0) {
				n = j % 10;
				j = (j - n) / 10;
				sum = sum + n;
			}
			
			if (sum == 15) {
				System.out.println(i);
			}
		}

	}

}
