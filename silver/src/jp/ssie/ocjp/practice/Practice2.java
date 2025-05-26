package jp.ssie.ocjp.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("10個の整数を入力してください：");
        
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        int maxCount = 1;
        int currentCount = 1;
        int value = nums[0];

        for (int i = 1; i < 10; i++) {
            if (nums[i] == nums[i - 1]) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    value = nums[i];
                }
            } else {
                currentCount = 1;
            }
        }

        System.out.println("最大連続回数は " + maxCount + "（数字" + value + "）");
        sc.close();
    }
}

