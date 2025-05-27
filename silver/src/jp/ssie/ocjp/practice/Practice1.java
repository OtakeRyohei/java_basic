package jp.ssie.ocjp.practice;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力>");
		int i = sc.nextInt();
		sc.close();
		
		int leng = String.valueOf(i).length();
		//System.out.println(leng);
		
		int[] num = new int [leng];
		int temp = i;
		
		for(int x=0; x<leng; x++) {
			num[x] = temp % 10;
			temp /= 10;
		}
		//System.out.println(Arrays.toString(num));
		
		int count = leng / 2;
		boolean  isFinal = true;
		
		for (int y=0; y<count; y++) {
		    if (num[y] != num[leng-1-y]){
		        isFinal = false;
		        break;
		    }
		}
		
		if(isFinal) {
			System.out.println("回文数です");
		}
		else {
			System.out.println("回文数ありません");
		}
			
		
	}

}
