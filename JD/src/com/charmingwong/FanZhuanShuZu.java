package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class FanZhuanShuZu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        while (scanner.hasNext()) {
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            int start = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    start = i;
                    break;
                }
            }
            int end = 0;
            for (int i = start + 1; i < size - 1; i++) {
                if (a[i] < a[i + 1]) {
                    end = i;
                    break;
                }
            }
            if (start != 0) {
                if (!(a[start] <= a[end + 1] && a[start - 1] <= a[end])) {
                    System.out.print("no");
                    return;
                }
            } else {
                if (!(a[start] <= a[end + 1])) {
                    System.out.print("no");
                    return;
                }
            }
            for (int i = end + 1; i < size - 1; i++) {
                if (a[i] > a[i + 1]) {
                    System.out.print("no");
                    return;
                }
            }
            System.out.print("yes");
        }
    }
}
