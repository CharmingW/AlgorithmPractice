package com.charmingwong;

/**
 * Created by CharmingWong on 2017/6/18.
 */
public class Insert {


    public static void main(String[] args) {

        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};

        sort(a);

        for (int i : a) {
            System.out.print(i);
        }

    }

    public static void sort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int temp = a[i];

            int j = i - 1;

            for (; j >= 0 && temp < a[j]; j--) {

                a[j+1] = a[j];
            }

            a[j+1] = temp;
        }
    }
}
