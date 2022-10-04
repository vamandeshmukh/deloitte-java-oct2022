package deloitte.demo.day02;

public class ArrayDemo {

	public static void main(String[] args) {

////		String []myFriends = {"Sonu"};
////		String[] myFriends = {"Sonu"};
//		String myFriends[] = { "Sonu", "Monu", "Tonu" };
//
////		System.out.println(myFriends[0]);
//
////		System.out.println(myFriends);
//
//		System.out.println("Array elements with for loop ");
//		for (int i = 0; i < myFriends.length; i++) {
//			System.out.println(myFriends[i]);
//		}
//
//		System.out.println("Array elements with for each loop ");
//		for (String friend : myFriends) {
//			System.out.println(friend);
//		}

		int[] arr = { 10, 20, 30, 40, 50 };
//		int[] arr = new int[5];

		for (int num : arr)
			System.out.println(num);

//		arr[5] = 35;

		for (int num : arr)
			System.out.println(num);
		
//		int[] arr2 = { 10, "a", 30, 40, 50 };

		int[] arr3 = { 10, 'a', 30, 40, 50 };
		
		System.out.println(arr3[1]);

	}

}











