package jp.ssie.ocjp.practice0422;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	
	ArrayList<Word> lists = new ArrayList<>();
	
	public Quiz() {
		Word s1 = new Word("りんご","Apple");
		Word s2 = new Word("ばなな","Banana");
		Word s3 = new Word("みかん","Orange");
		
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
	}
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		int correct = 0;
		int incorrect = 0;
		
		for(int i=0; i<lists.size(); i++) {
			Word s = lists.get(i);
			
			System.out.print(" 問題" + (i + 1) + "「" + s.getJp() + "」: ");
			//System.out.print("[入力]");
			String ans = sc.nextLine();
			
			if(ans.equals(s.getEn())) {
				System.out.println("正解");
				correct++;
			}
			else {
				System.out.println("不正解" + "(" + s.getEn() + ")");
				incorrect++;
			}
			
			System.out.println("---------------------------------------------");
			System.out.println("正解数:" + correct + " 不正解数:" + incorrect);
			
		}
		
		sc.close();
	}
}
