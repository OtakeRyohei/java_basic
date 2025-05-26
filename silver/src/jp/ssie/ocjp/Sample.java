package jp.ssie.ocjp;

public class Sample {
	
	public static void main(String[] args) {
		
		int x = 15;
		int y = 0;
		
		try {
			System.out.println("x / y" + x / y);
			System.out.println("x * y" + x * y);
		}
		catch(ArithmeticException ae) {
			System.out.println("発生した例外：" + ae);
			
		}
		System.out.println("x - y" + (x - y));
	}

}
