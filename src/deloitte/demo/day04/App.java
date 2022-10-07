package deloitte.demo.day04;

enum Month {
	JANUARY, FEBRUARY, MARCH
}

public class App {

	static DayOfTheWeek today;

	public static void main(String[] args) {

		System.out.println(App.today);

		today = DayOfTheWeek.FRIDAY;

		System.out.println(App.today);

		today = DayOfTheWeek.MONDAY;

		System.out.println(App.today);

		System.out.println(Month.MARCH);

	}

}

//package deloitte.demo.day04;
//
//public class App {
//	
//	static String today;
//
//
//	public static void main(String[] args) {
//		
//		
//		System.out.println(App.today);
//		
//		App.today = "Friday";
//		
//		System.out.println(App.today);
//
//
//		App.today = "Boilday"; // X 
//		
//		System.out.println(App.today);
//	}
//
//}
