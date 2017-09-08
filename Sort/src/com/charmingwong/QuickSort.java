package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        quickSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = getMiddle(a, low, high);
            quickSort(a, low, mid);
            quickSort(a, mid + 1, high);
        }
    }

    public static int getMiddle(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (high > low && temp < a[high]) {
                high--;
            }
            a[low] = a[high];
            while (high > low && temp > a[low]) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }
}
