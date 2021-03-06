package com.charmingwong;

/**
 * Created by CharmingWong on 2017/6/18.
 */
public class Bubble {

    public static void main(String[] args) {

        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};

        sort(a);

        for (int i : a) {
            System.out.print(i);
        }

    }

    public static void sort(int[] a) {

        int temp;

        boolean isBubble = false;

        for (int i = a.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (a[j] > a[j + 1]) {

                    temp = a[j];

                    a[j] = a[j + 1];

                    a[j + 1] = temp;

                    isBubble = true;
                }
            }

            if (!isBubble) {
                return;
            }
        }

    }
}
