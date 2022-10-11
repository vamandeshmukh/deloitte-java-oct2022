package deloitte.demo.day06.col;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<>();

		System.out.println(marksList.size());
		System.out.println(marksList); 
		marksList.add(98);
		marksList.add(95);
//		marksList.add("abc");
//		marksList.add('c');
//		marksList.add(false);
		System.out.println(marksList.size());
		System.out.println(marksList);
		marksList.add(97);
		System.out.println(marksList.size());
		System.out.println(marksList);
		marksList.remove(0);
		System.out.println("one element removed");
		System.out.println(marksList.size());
		System.out.println(marksList);
		
//		marksList.

	}

}
