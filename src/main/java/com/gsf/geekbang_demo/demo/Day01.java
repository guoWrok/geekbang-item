package com.gsf.geekbang_demo.demo;

import java.util.Arrays;

public class Day01 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.err.println(Arrays.toString(nums));

        Day01.removeRepetitionElement(nums);
    }

    public static int removeRepetitionElement(int[] nums){
        if (nums == null){
            return 0;
        }
        if (nums.length <= 1){
            return nums.length;
        }
        int maxInt = nums[nums.length - 1] + 1;
        int len = nums.length;
        int x = nums[0];
        int y = 1;
        for (int i = 1; i < len; i++){
            if (nums[i] != x){
                x = nums[i];
                y++;
            } else {
                nums[i] = maxInt;
            }
        }
        for (int a = 0; a < len; a++){
            for (int j = 0; j < len - 1 - a; j++){
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = temp;
                }
            }
        }
        System.err.println(Arrays.toString(nums));
        System.err.println(y);
        return 0;
    }
}
