package by.htp.home01.main;

/*
 * 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
информации.
 */

public class Task34 {

	public static void main(String[] args) {
		
		int b = 1999999999;
		
		int kb;
		int b1;
		
		kb = b / 1024;
		b1 = b % 1024;
		
		int mb;
		int kb1;
		
		mb = kb / 1024;
		kb1 = kb % 1024;
		
		int gb;
		int mb1;
		
		gb = mb / 1024;
		mb1 = mb % 1024;
		
		System.out.println("байты " + b);
		System.out.println("килобайты " + kb + " байты " + b1);
		System.out.println("мегабайты " + mb + " килобайты " + kb1 + " байты " + b1);
		System.out.println("гигабайты " + gb + " мегабайты " + mb1 + " килобайты " + kb1 + " байты " + b1);
		
	}

}
