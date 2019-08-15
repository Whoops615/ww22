package by.htp.home01.main3;

/*
 * 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

public class Task14 {

	public static void main(String[] args) {

		int n = 10;
		double result = 0;

		for (int i = 1; i <= n; i++) {
			result = result + (double) 1 / i;
		}
		
		System.out.println(result);

	}

}
