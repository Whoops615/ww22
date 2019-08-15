package by.htp.home01.main3;

public class Task38 {

	public static void main(String[] args) {

		int a = 987654321;

		int n = a % 10;
		int n1 = (a - n) / 10 % 10;

		int h = n - n1;
		System.out.println("Шаг: " + h);

		int z = 0;
		int z1 = 0;

		int y2 = 0;

		while (a > 10) {
			z = a % 10;
			z1 = (a - z) / 10 % 10;
			a = (a - z) / 10;

			if (z - z1 == h & h != 0) {
				y2 = h;
			} else {
				y2 = 130;
			}
		}

		if (h == 0) {
			System.out.println("Нету арифмитической последовательности");
		} else if (y2 == h) {
			System.out.println("Все чики-чики");
			if (h > 0) {
				System.out.println("Последовательность возврастающая");
			} else {
				System.out.println("Последовательность убывающая");
			}
		} else {
			System.out.println("Нету арифмитической последовательности");
		}
	}

}
