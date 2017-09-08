package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class BubbleSort {

    static int count = 0;

    public static void main(String[] args) {
//        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        bubbleSort(a);
        System.out.println(count);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        int temp;
        boolean isExchange;             //记录某一趟排序交换标识
        for (int i = a.length - 1; i > 0; i--) {
            isExchange = false;
            for (int j = 0; j < i; j++) {
                count++;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isExchange = true;
                }
            }
            if (!isExchange)            //若在某一趟排序中没有发生交换
                return;
        }
    }
}
