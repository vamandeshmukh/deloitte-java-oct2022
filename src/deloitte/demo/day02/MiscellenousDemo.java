package deloitte.demo.day02;

import java.util.Arrays;

public class MiscellenousDemo {

	public static void main(String[] args) {

//		String str1 = "abc";
//		String str2 = "def";
//
//		System.out.println(str1.equals(str2)); // yes
//		System.out.println(str1 == str2); // no

		int[] arr = { 22, 31, 25, 9, 19, 31, 13, 17 };

		System.out.println("Array elements before sorting:");
		for (int num : arr)
			System.out.println(num);

		Arrays.sort(arr);

		System.out.println("Array elements after sorting:");
		for (int num : arr)
			System.out.println(num);

	}

}
