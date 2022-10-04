package deloitte.demo.day02;

public class RangeDemo {

	public static void main(String[] args) {

//		int num = Integer.MAX_VALUE; // 2147483647
//		System.out.println(num);
//		int num2 = num + 1; // -2147483648
//		System.out.println(num2);

		byte b1 = 10;
		byte b2 = 20;
//		int b3 = b1 + b2;
		byte b3 = (byte) (b1 + b2);
//
//		System.out.println(b3);

//		System.out.println(Byte.MIN_VALUE); // -128  
//		System.out.println(Byte.MAX_VALUE); // 127

		int num = 10;
		char ch = 'a'; // 97 

//		System.out.println(ch + num); // 107 
		
		int num2 = 97;

		char ch2 = (char) num2;
		
		System.out.println(ch2);
		
		

	}

}

