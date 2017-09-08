package com.charmingwong;

/**
 * Created by CharmingWong on 2017/6/18.
 */
public class Select {

    public static void main(String[] args) {

        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};

        sort(a);

        for (int i : a) {
            System.out.print(i);
        }

    }

    public static void sort(int[] a) {

        int temp;

        int minIndex;

        for (int i = 0; i < a.length - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[minIndex] > a[j]) {

                    minIndex = j;
                }
            }

            temp = a[i];

            a[i] = a[minIndex];

            a[minIndex] = temp;


        }
    }
}

