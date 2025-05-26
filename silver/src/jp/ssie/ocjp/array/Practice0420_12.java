package jp.ssie.ocjp.array;

import java.util.Scanner;

public class Practice0420_12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力>");
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
