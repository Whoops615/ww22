package by.htp.home01.main2;

/*
 * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком
координатном угле).
 */

public class Task16 {

	public static void main(String[] args) {

		int x = 1;
		int y = -1;

		if (x == 0 & y == 0) {
			System.out.println("В начале координат");
		} else if (x == 0 & y != 0) {
			System.out.println("На оси Y");
		} else if (x != 0 & y == 0) {
			System.out.println("На оси X");
		} else if (x > 0 & y > 0) {
			System.out.println("В I координатном угле");
		} else if (x > 0 & y < 0) {
			System.out.println("В IV координатном угле");
		} else if (x < 0 & y > 0) {
			System.out.println("Во II координатном угле");
		} else if (x < 0 & y < 0) {
			System.out.println("В III координатном угле");
		} else
			;

	}

}
