package by.htp.home01.main;

/*
 * 38. Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class Task38 {

	public static void main(String[] args) {

		int x = -1;
		int y = -1;

		System.out.println(myMethod1(x, y));
		System.out.println(myMethod2(x, y));
		System.out.println(myMethod3(x, y));

	}

	public static boolean myMethod1(int x, int y) {

		int x1 = -4;
		int y1 = 0;
		int x2 = 0;
		int y2 = 4;
		int x3 = 4;
		int y3 = 0;

		int a = (x1 - x) * (y2 - y1) - (x2 - x1) * (y1 - y);
		int b = (x2 - x) * (y3 - y2) - (x3 - x2) * (y2 - y);
		int c = (x3 - x) * (y1 - y3) - (x1 - x3) * (y3 - y);

		if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean myMethod2(int x, int y) {
		
		if (y >= 0 & y <= 4 & x >= -2 & x <= 2) {
			return true;
		} else if (x >= -4 & x <= 4 & y >= -3 & y <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean myMethod3(int x, int y) {

		double c = Math.hypot(x, y);

		if (c <= 5 & x >= 0 & x <= 5 & y <= 0 & y >= -5) {
			return true;
		} else if (c <= 4 & x >= 0 & x <= 4 & y >= 0 & y <= 4) {
			return true;
		} else {
			return false;
		}
	}

}
