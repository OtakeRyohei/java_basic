package jp.ssie.ocjp.array;

import java.util.ArrayList;

public class Practice0420_8 {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		l2.add(11);
		l2.add(22);
		l2.add(33);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(l1);
		list.add(l2);
		
		int max = l1.get(0);
		int min = l1.get(0);
		
		for(ArrayList<Integer> row : list) {
			for(int i : row) {
				if(max>i) {
					max = i;
				}
				if(min<i) {
					min = i;
				}
			}
		}
		
		System.out.println("最大:" + max);
		System.out.println("最小:" + min);

	}

}
