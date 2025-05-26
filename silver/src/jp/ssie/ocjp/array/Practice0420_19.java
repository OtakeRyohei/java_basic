package jp.ssie.ocjp.array;

import java.util.Random;
import java.util.Scanner;

public class Practice0420_19 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
		String [] engs = {"January","February","March","April",
				"May","June","July","August","September",
				"October","November","December"};
		
		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		
		while(ans) {
			int num = rand.nextInt(12);
			
			System.out.print(numbers[num]+"月の英語表記は？>");
			String str = sc.nextLine();
			
			
			if(str.equals(engs[num])) {
				System.out.println("正解です");
				System.out.println("もう一度？ 1:Yes 2:No");
				int select = sc.nextInt();
				sc.nextLine();
				
				if(select == 1) {
					continue;
				}
				else if(select == 2) {
					ans = false;
				}
				else {
					continue;
				}	
			}
			else {
				System.out.println("不正解です");
			}
			
		}
		sc.close();

	}

}
