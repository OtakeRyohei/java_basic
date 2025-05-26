package jp.ssie.ocjp.branch;

public class Practice0415_9 {
	public static void main(String[] args) {
		int x = 56;
		int y = 82;
		
		if(x > y) {
			System.out.println("小さい方の値は"+ y + "です");
			System.out.println("大きい方の値は"+ x + "です");
		}
		else if (y > x) {
			System.out.println("小さい方の値は"+ x + "です");
			System.out.println("大きい方の値は"+ y + "です");

		}
		else if (y == x) {
			System.out.println("2つの値は同じです");
		}
	}

}
