package jp.ssie.ocjp.array;

import java.util.Scanner;

public class Practice0420_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力>");
		int num = sc.nextInt();
		sc.close();

		if(num == 100) {
			System.out.println("満点です");
		}
		else if(60 <= num && num <= 99) {
			System.out.println("合格です");
		}
		else if(0 <= num && num <= 59) {
			System.out.println("不合格です");
		}
		else {
			System.out.println("不正な値です");
		}

	}

}
