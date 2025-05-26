package jp.ssie.ocjp.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int num = rand.nextInt(100);
		//System.out.println(num);
				
		boolean answer = true;
		Scanner sc = new Scanner(System.in);
		
		while(answer) {
			System.out.print("推測を入力:");
			int i = sc.nextInt();
			
			if(i < num) {
				System.out.println("小さいです");
			}
			else if(i > num) {
				System.out.println("大きいです");
			}
			else if(i == num) {
				System.out.println("正解！");
				answer = false;
			}
	
		}
		sc.close();
		
	}

}
