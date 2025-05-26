package jp.ssie.ocjp.array;

import java.util.Scanner;

public class Practice0420_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力>");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
