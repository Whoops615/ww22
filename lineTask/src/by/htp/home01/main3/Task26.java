package by.htp.home01.main3;

/*
 * 26. Вывести на экран соответствий между символами и их численными обозначениями в памяти
компьютера (Таблицу ASCII).
 */

public class Task26 {

	public static void main(String[] args) {

		System.out.println("int   |   char");
		System.out.println("--------------");
		
		for (int i = 33; i < 127; i++) {
			
			System.out.println("   " + i + " |  " + (char) i + " ");
		}

	}

}
