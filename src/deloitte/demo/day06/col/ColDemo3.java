package deloitte.demo.day06.col;

import java.util.ArrayList;

public class ColDemo3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);

		ArrayList<Integer> list2 = new ArrayList<>();

		list2.add(100);
		list2.add(200);
		list2.add(300);

		System.out.println(list);
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
	}

}
