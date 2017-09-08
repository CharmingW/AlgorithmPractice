package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class MergingSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] a, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            sort(a, left, center);
            sort(a, center + 1, right);
            merge(a, left, center, right);
        }
    }

    public static void merge(int[] a, int left, int center, int right) {
        int mid = center + 1;
        int[] tempArray = new int[right - left + 1];
        int third = 0;
        int temp = left;
        while (left <= center && mid <= right) {
            if (a[left] < a[mid]) {
                tempArray[third++] = a[left++];
            } else {
                tempArray[third++] = a[mid++];
            }
        }
        while (left <= center) {
            tempArray[third++] = a[left++];
        }
        while (mid <= right) {
            tempArray[third++] = a[mid++];
        }
        for (int i : tempArray) {
            a[temp++] = i;
        }
    }
}
