package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        shellSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void shellSort(int[] a) {
        int temp;
        int d = a.length;
        while (true) {
            d = (int) Math.ceil(d / 2d);
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i += d) {
                    temp = a[i];
                    int j = i - d;
                    for (; j >= 0 && a[j] > temp; j -= d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1) {
                break;
            }
        }
    }
}
