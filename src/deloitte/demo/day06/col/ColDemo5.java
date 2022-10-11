package deloitte.demo.day06.col;

import java.util.ArrayList;

public class ColDemo5 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10); 
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		list.forEach(e -> System.out.println(e));

	}

}
