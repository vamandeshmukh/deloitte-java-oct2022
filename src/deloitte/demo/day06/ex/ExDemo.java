package deloitte.demo.day06.ex;

import java.util.Scanner;

//throw 
//throws 

public class ExDemo {

	static void divNums() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1: ");

		int num1 = sc.nextInt();

		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by zero.");
			ExDemo.divNums();
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {

		System.out.println("Start");
		ExDemo.divNums();
		System.out.println("End");

	}

}
