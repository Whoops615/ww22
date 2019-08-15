package by.htp.home01.main2;

import java.util.Scanner;

/*
 * 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
это не так.
 */

public class Task30 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 3 числа  >>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Результат:");
		
		if(a > b & b > c) {
			a = a*2;
			b = b*2;
			c = c*2;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

}
