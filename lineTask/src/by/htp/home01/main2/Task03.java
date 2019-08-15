package by.htp.home01.main2;

/*
 * 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше
3; если больше, то вывести слово «no».
 */

public class Task03 {

	public static void main(String[] args) {

		int a;

		a = 4;

		if (a < 3) {
			System.out.println("yes");
		} else if (a > 3) {
			System.out.println("no");
		} else {
			System.out.println("Числа равны");
		}
			

	}

}
