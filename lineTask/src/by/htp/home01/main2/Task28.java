package by.htp.home01.main2;

/*
 * 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —
c).
 */

public class Task28 {

	public static void main(String[] args) {

		int a = 22;
		int b = 40;
		int c = 29;

		int d = 25;

		if (a == d) {
			System.out.println("Число " + a + " равно d");
		} else if (b == d) {
			System.out.println("Число " + b + " равно d");
		} else if (c == d) {
			System.out.println("Число " + c + " равно d");
		} else {
			System.out.println("Большее из а и d = " + Math.max(a, d));
			System.out.println("Большее из b и d = " + Math.max(b, d));
			System.out.println("Большее из c и d = " + Math.max(c, d));
		}

	}

}
