package jp.ssie.ocjp.array;

import java.util.Random;

public class Practice0420_18 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[5];
		
		//初期値の入力
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rand.nextInt(10) + 1;
		}
		
		//重複の確認
		for(int i=0; i<numbers.length - 1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					numbers[j] = rand.nextInt(10) + 1;
				}
			}
		}
	
		
		//配列の出力
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
