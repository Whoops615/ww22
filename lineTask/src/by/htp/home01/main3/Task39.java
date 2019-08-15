package by.htp.home01.main3;

/*
 * 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
получили исходное число. Найти это число.
 */

public class Task39 {

	public static void main(String[] args) {

		int start = 0;

		for (int i = 15; i < 100; i++) {
			start = i * 7;

			if (start % 100 == i) {
				System.out.println("Исходное число: " + start);
			}
		}

	}

}
