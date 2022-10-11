package deloitte.demo.day06.col.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(22);
		list.add(31);
		list.add(9);
		list.add(25);
		list.add(10);

		System.out.println("Original list:");
		System.out.println(list);

		System.out.println("Sorted list:");
		Collections.sort(list);
		System.out.println(list);
		
//		Integer num = 10;
//		
//		num.com

	}

}
