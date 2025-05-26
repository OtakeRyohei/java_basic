package jp.ssie.ocjp.sample;

public class Sample2_9 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a == b : "+ (a == b));
		System.out.println("a != b : "+ (a != b));
		System.out.println("a > b : "+ (a > b));
		System.out.println("a >= b : "+ (a >= b));
		System.out.println("a < b : "+ (a < b));
		System.out.println("a <= b : "+ (a <= b));
		
		String str1 = new String("文字列です");
		String str2 = new String("文字列です");
		
		System.out.println("文字列の比較 : " + str1.equals(str2));
	}
}
