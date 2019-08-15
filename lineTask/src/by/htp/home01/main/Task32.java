package by.htp.home01.main;

/*
 * 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
часы через р ч q мин r с?
 */

public class Task32 {

	public static void main(String[] args) {
		
		int h = 5;
		int m = 32;
		int s = 44;
		
		int h2 = 2;
		int m2 = 50;
		int s2 = 18;
		
		int time;
		int time1;
		int time2;
		
		int h3;
		int m3;
		int s3;
		
		time = h*3600 + m*60 + s;
		time1 = h2*3600 + m2*60 + s2;
		time2 = time + time1;
		
		h3 = time2 / 3600;
		m3 = time2 % 3600 / 60;
		s3 = time2 % 3600 % 60;
		
		System.out.println(h3 + " часов " + m3 + " минут " + s3 + " секунд");

	}

}
