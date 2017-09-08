package com.charmingwong;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 6, 9, 0, 8, 7, 5};
        for (int i = 0; i < a.length - 1; i++) {
            buildMaxHeap(a, a.length - 1 - i);
            swap(a, 0, a.length - 1 - i);
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void buildMaxHeap(int[] a, int lastIndex) {
        int i = (lastIndex - 1) / 2;
        for (; i >= 0; i--) {
            int k = i;
            while (k * 2 + 1 <= lastIndex) {            //k结点下面有子节点
                int biggerIndex = k * 2 + 1;
                if (biggerIndex < lastIndex) {
                    if (a[biggerIndex] < a[biggerIndex + 1]) {
                        biggerIndex++;
                    }
                }
                if (a[k] < a[biggerIndex]) {
                    swap(a, k, biggerIndex);
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }
}
