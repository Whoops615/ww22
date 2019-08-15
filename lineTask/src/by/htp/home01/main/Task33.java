package by.htp.home01.main;

/*
 * 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
 */

public class Task33 {

	public static void main(String[] args) {
		
		char a = 'k';
		
		int a1 = a;
		int b1= a1-1;
		int c1 = a1+1;
		
		char b = (char)b1;
		char c = (char)c1;
		
		System.out.println("Номер символа " + a + " = " + a1);
		System.out.println("Предыдущий символ " + b);
		System.out.println("Следующий символ " + c);
		
	}

}
