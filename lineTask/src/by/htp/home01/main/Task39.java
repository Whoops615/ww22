package by.htp.home01.main;

/*
 * 39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
сложения и вычитания, вычислите за минимальное число операций:
2x4 - 3х3 + 4х2 - 5х + 6.
 */

public class Task39 {

	public static void main(String[] args) {

		int x = 4;

		int y;
		
		int x2;
		
		x2 = x*x;
		

		y = 2 * x2 * x2 - 3 * x2 * x + 4 * x2 - 5 * x + 6;

		System.out.println(y);

	}

}
