package jp.ssie.ocjp.practice;
import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		
		String pass = "letmein";
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.print("パスワードを入力>");
			String log = sc.nextLine();
			
			if(pass.equals(log)) {
				System.out.println("ログイン成功");
				break;
			}
			else {
				System.out.println("ログイン失敗");
			}
		}
		
		sc.close();
	}
}
