package by.htp.home01.main;

/*
 * 37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
• Целое число N является четным двузначным числом.
• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
• Сумма цифр данного трехзначного числа N является четным числом.
• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
• Треугольник со сторонами а,b,с является равнобедренным.
• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
 */

public class Task37 {

	public static void main(String[] args) {

		System.out.println(myMethod1(44));
		System.out.println(myMethod2(3434));
		System.out.println(myMethod3(343));
		System.out.println(myMethod4(4, -5, 6, -8));
		System.out.println(myMethod5(444));
		System.out.println(myMethod6(5,5,7));
		System.out.println(myMethod7(224));
		System.out.println(myMethod8(2,16));
	}

	public static boolean myMethod1(int a) {

		int a1 = a % 2;

		if (a1 == 0 & a >= 10 & a <= 99) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean myMethod2(int x) {

		int a = x % 100;
		int b = (x - a) / 100;
		int a2 = 0;
		int b2 = 0;
		
		for (int f1 = a; f1 > 0; f1 /= 10) {
			int a1 = f1 % 10;
			a2 += a1;
		}
		for (int f2 = b; f2 > 0; f2 /= 10) {
			int b1 = f2 % 10;
			b2 += b1;
		}

		if (a2 == b2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean myMethod3(int x) {
		
		int a2 = 0;
		
		for (int a = x; a != 0; a /= 10) {
			int a1 = a % 10;
			a2 += a1;
		}

		if (a2 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean myMethod4(int x, int y, int t, int n) {

		if (x <= t & x >= n) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean myMethod5(int x) {

		int a2 = 0;
		
		for (int a = x; a != 0; a /= 10) {
			int a1 = a % 10;
			a2 += a1;
		}
		int x1 = a2 * a2 * a2;
		int x2 = x * x;

		if (x1 == x2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean myMethod6(int a, int b, int c) {

		if (a == b || a == c || b == c) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean myMethod7(int a) {

		int a1 = a % 10;
		int a2 = a / 10 % 10;
		int a3 = a / 100;

		if (a1 + a2 == a3 || a1 + a3 == a2 || a2 + a3 == a1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean myMethod8(int n, int a) {
		
		int n1 = n;
		int n2 = n*n;
		int n3 = n*n*n;
		int n4 = n*n*n*n;
		
		if(a == n1 || a == n2 || a == n3 || a == n4) {
			return true;
		}
		else {
			return false;
		}
	}

}
