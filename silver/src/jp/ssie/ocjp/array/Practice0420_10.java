package jp.ssie.ocjp.array;

import java.util.Scanner;

public class Practice0420_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力>");
		int num = sc.nextInt();
		sc.close();
		
		if(num == 1234) {
			System.out.println("パスワードと一致しました");
		}else {
			System.out.println("パスワードと一致しません");
		}
	}

}
