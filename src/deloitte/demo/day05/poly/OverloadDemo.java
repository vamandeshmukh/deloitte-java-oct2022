package deloitte.demo.day05.poly;

class Calc {

	public int addNums(int i, int j) {
		return i + j;
	}

	public int addNums(int i, byte j) {
		return i + j;
	}

	public int addNums(byte i, int j) {
		return i + j;
	}

	public int addNums(int i, int j, int k) {
		return i + j + k;
	}

	public int addNums(int i, int j, int k, int l) {
		return i + j + k + l;
	}
}

public class OverloadDemo {

	public static void main(String[] args) {

		Calc calc = new Calc();
//		System.out.println(calc.addNums(10));
		System.out.println(calc.addNums(10, 20));
		System.out.println(calc.addNums(10, 20, 30));
		System.out.println(calc.addNums(10, 20, 30, 40));

	}

}
