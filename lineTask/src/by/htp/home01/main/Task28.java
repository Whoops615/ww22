package by.htp.home01.main;

/*
 * 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */

public class Task28 {

	public static void main(String[] args) {
		
		double rad = 5;
		
		double gr;
		double min;
		double sek;
		int gr1;
		int min1;
		int sek1;
		
		gr = (rad * 180) / Math.PI;
		gr1 =(int)gr;
		min = (gr - gr1) * 60;
		min1 = (int)min;
		sek = (min-min1)*60;
		sek1 = (int)sek;
		
		System.out.println(gr1 + " градусов " + min1 + " минут " + sek1 + " секунд");

	}

}
