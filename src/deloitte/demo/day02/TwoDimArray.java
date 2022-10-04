package deloitte.demo.day02;

public class TwoDimArray {

	public static void main(String[] args) {

//		int[][] arr = new int[3][3];
		int[][] arr = { { 10, 20, 30 }, { 15, 25, 35 }, { 18, 28, 38 } };

		System.out.println("Oroginal array");
		for (int[] innerArray : arr) {
			for (int elem : innerArray) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
		
		arr[2][1] = 29;
		
		System.out.println("Modified array");
		for (int[] innerArray : arr) {
			for (int elem : innerArray) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
	}

}
