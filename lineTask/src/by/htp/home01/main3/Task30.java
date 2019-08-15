package by.htp.home01.main3;

/*
 * 30. Написать программу, переводящую римские цифры в арабские.
 */

public class Task30 {

	public static void main(String[] args) {

		String s = "MDCLXIX";
		System.out.println("Римские: " + s);

		int sum = 0;
		int a = 1000;
		int b;

		for (int i = 0; i < s.length(); i++) {

			b = getArab(s.charAt(i));

			if (a > b | a == b) {
				sum = sum + b;
			} else if (a < b) {
				sum = sum + (b - a - a);
			}
			a = b;
		}
		System.out.println("Арабские: " + sum);
	}

	public static int getArab(char n) {

		int arab = 0;

		switch (n) {
		case 'X':
			arab = 10;
			break;
		case 'V':
			arab = 5;
			break;
		case 'I':
			arab = 1;
			break;
		case 'L':
			arab = 50;
			break;
		case 'C':
			arab = 100;
			break;
		case 'D':
			arab = 500;
			break;
		case 'M':
			arab = 1000;
			break;
		}
		return arab;
	}

}
