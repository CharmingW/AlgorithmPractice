package com.charmingwong;

/**
 * Created by CharmingWong on 2017/6/18.
 */
public class Merge {


    public static void main(String[] args) {

        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};

        sort(a, 0, a.length - 1);

        for (int i : a) {

            System.out.print(i);
        }

    }

    public static void sort(int[] a, int left, int right) {

        if (left < right) {

            int center = (left + right) / 2;

            sort(a, 0, center);

            sort(a, center + 1, right);

            merge(a, left, center, right);
        }
    }

    public static void merge(int[] a, int left, int center, int right) {

        int[] tempArr = new int[right - left + 1];

        int tempIndex = 0;

        int middle = center + 1;

        int startIndex = left;

        while (left <= center && middle <= right) {

            if (a[left] < a[middle]) {

                tempArr[tempIndex++] = a[left++];
            } else {

                tempArr[tempIndex++] = a[middle++];
            }
        }

        while (left <= center) {

            tempArr[tempIndex++] = a[left++];
        }
        while (middle <= right) {

            tempArr[tempIndex++] = a[middle++];
        }

        for (int i : tempArr) {

            a[startIndex++] = i;
        }

    }

}
