package deloitte.demo.day06.col;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> mySet = new HashSet<>();
//		HashSet<Integer> mySet = new HashSet<>();
 
		mySet.add(10);
		mySet.add(15);
		mySet.add(20);
		mySet.add(25);
		System.out.println(mySet.size());
		System.out.println(mySet);
		mySet.add(20);
		System.out.println(mySet.size());
		System.out.println(mySet);

//		mySet = new LinkedHashSet<>();

	}

}
