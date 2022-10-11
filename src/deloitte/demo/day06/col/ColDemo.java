package deloitte.demo.day06.col;

import java.util.ArrayList;

public class ColDemo {

	public static void main(String[] args) {

//		int[] arr = { 10, 20, 30 };

//		List Map Set Queue 

		ArrayList marksList = new ArrayList();

		System.out.println(marksList.size());
		System.out.println(marksList);
		marksList.add(98);
		marksList.add(95);
		marksList.add(99);
		marksList.add(97); 
		marksList.add(98);
		System.out.println(marksList.size());
		System.out.println(marksList);
		marksList.add(97);
		System.out.println(marksList.size());
		System.out.println(marksList);
		marksList.remove(3);
		System.out.println("one element removed");
		System.out.println(marksList.size());
		System.out.println(marksList);
	}

}
