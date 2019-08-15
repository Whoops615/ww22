package by.htp.home01.main2;

/*
 * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task29 {

	public static void main(String[] args) {

		int x1 = 2;
		int y1 = 2;

		int x2 = -2;
		int y2 = 2;

		int x0 = -1;
		int y0 = 2;

		double distance;

		distance = (Math.abs((y2 - y1) * x0 - (x2 - x1) * y0 + x2 * y1 - y2 * x1))
				/ Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		
		if(distance == 0) {
			System.out.println("Лежат на одной прямой");
		}
		else {
			System.out.println("Не лежат на одной прямой");
		}

	}

}
