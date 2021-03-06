package com.charmingwong;

import java.text.BreakIterator;

/**
 * Created by CharmingWong on 2017/6/18.
 */
public class Shell {

    public static void main(String[] args) {

        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};

        sort(a);

        for (int i : a) {
            System.out.print(i);
        }

    }

    public static void sort(int[] a) {

        int d = a.length;

        while (true) {

            d = (int) Math.ceil(d / 2);

            for (int x = 0; x < d; x++) {

                for (int i = x + d; i < a.length; i += d) {

                    int temp = a[i];

                    int j = i - d;

                    for (; j >= 0 && temp < a[j]; j -= d) {

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
