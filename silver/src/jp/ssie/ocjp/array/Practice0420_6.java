package jp.ssie.ocjp.array;

import java.util.ArrayList;

public class Practice0420_6 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(100);
		nums.add(200);
		nums.add(300);
		
		for(int x : nums) {
			System.out.println(x);
		}
		
		nums.set(0, 400);
		
		int sum = 0;
		for(int y : nums) {
			sum += y;
		}
		
		System.out.println(sum);
		

	}

}
