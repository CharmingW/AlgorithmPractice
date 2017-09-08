package com.charmingwong.practice;

import java.util.Arrays;

/**
 * Created by CharmingWong on 2017/7/14.
 */
public class Exam2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 1, 4, 8, 2, 7, 5, 4, 10, 6, 5, 9};
        findCommonNum(arr);
    }

    private static void findCommonNum(int[] arr) {

        Arrays.sort(arr);

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    for (int j = 0; j < count; j++) {
                        System.out.print(arr[i - 1] + " ");
                    }
                    count = 1;
                }
            }
        }
    }
}
