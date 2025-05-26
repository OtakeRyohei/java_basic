package jp.ssie.ocjp.sample;

import java.util.Scanner;

public class Sample3_6_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力>");int i = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int x=1; x<=i; x++) {
			sum += x;
		}
		
		System.out.println(sum);
	}

}
