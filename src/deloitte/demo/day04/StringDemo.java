package deloitte.demo.day04;

public class StringDemo {

	public static void main(String[] args) {

		String fullName = "Vaman Deshmukh";

		String[] strArray = fullName.split(" ");
		
		String firstName = strArray[0];
		String lastName = strArray[1];
		
		System.out.println(firstName);
		System.out.println(lastName);

//		for (String str : strArray)
//			System.out.println(str);

	}

}
