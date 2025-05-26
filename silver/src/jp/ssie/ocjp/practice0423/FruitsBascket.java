package jp.ssie.ocjp.practice0423;

import java.util.ArrayList;

public class FruitsBascket {
	
	int max = 10;
	ArrayList<Fruits> lists = new ArrayList<>(max);
	
	public void put(Fruits f) {	
		if(lists.size() < max) {
			lists.add(f);
		}
	}
	
	public Fruits take(int i) {
		Fruits s = lists.get(i);
		return s;
	}
	
}
