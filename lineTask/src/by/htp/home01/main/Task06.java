package by.htp.home01.main;

/*
 * 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
если в каждом большом бидоне на 12 л. больше, чем в малом?
 */

public class Task06 {

	public static void main(String[] args) {

		int n;
		int m;

		int k;

		n = 8;
		m = 6;

		k = ((80 / n) + 12) * m;
		
		System.out.println(k);

	}

}
