package jp.ssie.ocjp.branch;

public class Practice0415_4 {
	public static void main(String[] args) {
		int n =78;
		
		if(80<=n && n<=100) {
			System.out.println("優");
		}
		else if(70<=n && n<80) {
			System.out.println("良");
		}
		else if(60<=n && n<70) {
			System.out.println("可");
		}
		else if(0<=n && n<60) {
			System.out.println("不");
		}else {
			System.out.println("不正な点数です");
		}

	}
}
