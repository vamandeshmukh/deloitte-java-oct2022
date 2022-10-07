package deloitte.demo.day04;

import java.util.Random;

public class OtpDemo {

	public static void main(String[] args) {

		System.out.println(OtpDemo.getOtp());

	}

	public static int getOtp() { // 6 digit otp

		Random random = new Random();
		int otp = 0;

		while (otp < 100000 || otp > 999999) {

			otp = random.nextInt(999999);

		}

		return otp;

	}

}
