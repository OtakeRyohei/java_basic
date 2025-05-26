package jp.ssie.ocjp.array;

import java.util.ArrayList;

public class Practice0420_5 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("鈴木");
		names.add("佐藤");
		names.add("田中");
		names.add("井上");
		names.add("前田");
		
		System.out.println(names.get(4));
		
		names.remove(1);
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}

}
