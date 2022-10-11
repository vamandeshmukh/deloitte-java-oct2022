package deloitte.demo.day06.ex;

public class CheckedDemo {

	static void printNums() {

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(500);
			} 
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		System.out.println("Start");
		CheckedDemo.printNums();
		System.out.println("End");

	}

}
