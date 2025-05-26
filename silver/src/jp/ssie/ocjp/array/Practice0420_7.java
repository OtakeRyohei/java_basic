package jp.ssie.ocjp.array;

import java.util.ArrayList;

public class Practice0420_7 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> prices = new ArrayList<>();
		
		names.add("りんご");
		names.add("みかん");
		names.add("ばなな");
		
		prices.add(120);
		prices.add(150);
		prices.add(90);
		
		for(int i=0; i<names.size(); i++) {
			System.out.println("「"+names.get(i)+"=>"+prices.get(i)+"円」");
		}
	}
}
