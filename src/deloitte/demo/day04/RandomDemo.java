package deloitte.demo.day04;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random random = new Random();

		for (int i = 1; i <= 10; i++) {
			Integer num = random.nextInt(100);
			System.out.println(num);
		}
	}
}
