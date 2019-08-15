package by.htp.home01.main;

/*
 * 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Task22 {

	public static void main(String[] args) {
		
		int t = 7599;
		
		int s;
		int m;
		int h;
		
		h = t / 3600;
		m = t % 3600 / 60;
		s = t % 3600 % 60;
		
		System.out.println(h + "часов " + m + "минут " + s + "секунд");

	}

}
