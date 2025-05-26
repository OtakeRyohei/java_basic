package jp.ssie.ocjp.branch;

public class Practice0415_8 {
	public static void main(String[] args) {
		int x = 23;
		int y = 72;
		int z = 56;
		
		if(x >= y && x >= z) {
			System.out.println(x);
		}
		else if(y >= x && y >= z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
	}
}
