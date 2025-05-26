package jp.ssie.ocjp.array;

public class Practice0420_2 {
	public static void main(String[] args) {
		
		int[] nums = {7,3,2,9,1};
		
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		System.out.println("合計:" + sum);
		
		double avg = (double)sum / nums.length;
		System.out.println("平均" + avg);
		
		int max = nums[0];
		int min = nums[0];
		for(int j=1; j<nums.length; j++) {
			if(max<nums[j]) {
				max = nums[j];
			}
			if(min>nums[j]) {
				min = nums[j];
			}
		}
		System.out.println("最大:" + max);
		System.out.println("最小:" + min);
	}

}
