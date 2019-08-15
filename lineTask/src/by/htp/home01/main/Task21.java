package by.htp.home01.main;

/*
 * 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */

public class Task21 {

	public static void main(String[] args) {
		
		double r = 123.456;
		
		double a;
		double b;
		double c;
		
		a = r * 1000 % 1000;
		b = (r * 1000 - a) / 1000;
		c = a + b / 1000;
		
		System.out.println(c);
	}

}
