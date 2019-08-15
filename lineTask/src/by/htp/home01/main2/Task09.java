package by.htp.home01.main2;

/*
 * 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
равносторонним.
 */

public class Task09 {

	public static void main(String[] args) {

		int a = 6;
		int b = 6;
		int c = 7;

		if (a == b & b == c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}

	}

}
