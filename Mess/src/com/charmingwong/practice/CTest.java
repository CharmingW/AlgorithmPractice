package com.charmingwong.practice;

/**
 * Created by CharmingWong on 2017/9/7.
 */
public class CTest {

    public static int[] constructArray(int[] arr) {

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    temp *= arr[j];
                }
            }
            newArr[i] = temp;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i : constructArray(arr)) {
            System.out.println(i);
        }
    }
}
