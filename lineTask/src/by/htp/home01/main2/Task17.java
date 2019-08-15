package by.htp.home01.main2;

/*
 * 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
из исходных, а если равны, то заменить числа нулями.
 */

public class Task17 {

	public static void main(String[] args) {

		int m = 11;
		int n = 10;

		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println(m);
				System.out.println(n);
			} else {
				m = n;
				System.out.println(m);
				System.out.println(n);
			}
		} else {
			n = 0;
			m = 0;
			System.out.println(m);
			System.out.println(n);
		}

	}

}
