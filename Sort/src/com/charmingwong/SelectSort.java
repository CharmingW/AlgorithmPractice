package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        selectSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void selectSort(int[] a) {
        int minIndex;
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
