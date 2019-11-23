package com.gsf.geekbang_demo.demo;

import java.util.Arrays;

public class Day02 {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        int[] arr = new int[]{-1,-100,3,99};
//        Day02.arrayRevolveOne(array, 3);
//        Day02.arrayRevolveOne(arr, 2);

        Day02.arrayRevolveTwo(array, 3);
        Day02.arrayRevolveTwo(arr, 2);
    }

    public static int[] arrayRevolveOne(int [] array, int num){
        System.err.println(Arrays.toString(array));
        if (num <= 0){
            return array;
        }
        int len = array.length;
        for (int j = 0; j < num; j++){
            int temp = array[len - 1];
            for (int i = len - 1; i > 0; i--){
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
        System.err.println(Arrays.toString(array));
        return array;
    }

    public static int[] arrayRevolveTwo(int [] array, int num) {
        System.err.println(Arrays.toString(array));
        if (num <= 0) {
            return array;
        }
        while (num > 0){
            int len = array.length;
            int temp = array[len - 1];
            int j = len;
            while (len > 1){
                array[len - 1] = array[len - 2];
                len--;
            }
            array[0] = temp;
            num--;
        }
        System.err.println(Arrays.toString(array));
        return array;
    }
}
