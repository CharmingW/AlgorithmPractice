package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        insertSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void insertSort(int[] a) {
        int temp;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            int j = i - 1;
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
    }
}
