package by.htp.home01.main3;

/*
 * 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
 */

public class Task17 {

	public static void main(String[] args) {

		int a = 4;
		int n = 10;
		int result = 1;

		for (int i = 1; i < n; i++) {
			result = result * (a + i);
		}
		System.out.println("Результат: " + result);

	}

}
