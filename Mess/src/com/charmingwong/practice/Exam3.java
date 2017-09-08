package com.charmingwong.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CharmingWong on 2017/7/14.
 */
public class Exam3 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 1, 4, 8, 2, 7, 5, 4, 10, 6, 5, 9};
        findCommonNum(arr);
    }

    private static void findCommonNum(int[] arr) {

        List<Integer> keys = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (int i : arr) {
            int index = keys.indexOf(i);
            if (index == -1) {
                keys.add(i);
                counts.add(1);
            } else {
                counts.set(index, counts.get(index) + 1);
            }
        }
        for (int i = 0; i < keys.size(); i++) {
            int count = counts.get(i);
            if (count < 2) continue;
            for (int j = 0; j < count; j++) {
                System.out.print(keys.get(i) + " ");
            }
        }
    }
}
