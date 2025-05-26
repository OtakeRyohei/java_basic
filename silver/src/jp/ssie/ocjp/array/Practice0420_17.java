package jp.ssie.ocjp.array;

import java.util.Random;

public class Practice0420_17 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		
		if(num>=85) {
			System.out.println("大吉");
		}
		else if(num>=50) {
			System.out.println("吉");
		}
		else if(num>=15) {
			System.out.println("凶");
		}
		else {
			System.out.println("大凶");
		}
		
		System.out.println(num);
	}

}
