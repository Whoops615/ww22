package by.htp.home01.main3;

/*
 * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности.
 */

public class Task12 {

	public static void main(String[] args) {

		int a = 1;
		long result = 1;

		for (int n = 2; n <= 10; n++) {
			a = 6 + a;
			System.out.print(a + " ");
			result *= a;
		}
		System.out.println("\n--------------------------");
		System.out.println("Результат произведения: " + result);

	}

}
