package deloitte.demo.day06.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Telangana");
		myMap.put(20, "Maharashtra");
		myMap.put(30, "Andhra Pradesh");
		myMap.put(40, "Gujrat");

		System.out.println(myMap.get(20));
		System.out.println(myMap);
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());

	}

}
