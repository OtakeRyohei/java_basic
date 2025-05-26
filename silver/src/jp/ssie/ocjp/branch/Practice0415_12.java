package jp.ssie.ocjp.branch;

public class Practice0415_12 {
	public static void main(String[] args) {
		int n = 2000;
		
		if (n%4 == 0 && n%100 != 0) {
			System.out.println("閏年です");
		}
		else if (n%400 == 0) {
			System.out.println("閏年です");
		}
		else {
			System.out.println("平年です");
		}
	}

}
