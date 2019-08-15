package by.htp.home01.main;

/*
 * 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */

public class Task29 {

	public static void main(String[] args) {

		int ab = 6;
		int ac = 9;
		int bc = 7;

		double cosa;
		double cosb;
		double cosc;

		cosa = (double) (ab * ab + ac * ac - bc * bc) / (2 * ab * ac);
		cosb = (double) (bc * bc + ab * ab - ac * ac) / (2 * bc * ab);
		cosc = (double) (ac * ac + bc * bc - ab * ab) / (2 * ac * bc);
		
		double a = Math.acos(cosa);
		double a1 = Math.toDegrees(a);
		System.out.println(a1);
		
		double b = Math.acos(cosb);
		double b1 = Math.toDegrees(b);
		System.out.println(b1);
		
		double c = Math.acos(cosc);
		double c1 = Math.toDegrees(c);
		System.out.println(c1);
		



	}

}
