package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/15.
 */
public class ChengFaBiao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        for (int i = 1; i <= max; i++) {
            sum = 0;
            for (int j = 1; j <= min; j++) {
                sum += i / j;
            }
            if (sum >= k) {
                System.out.print(i);
                return;
            }
        }
        int remained = k - sum;
        int index = (remained / (min - 1) + max / 2);
        int yu = remained % (min - 1);
        if (yu == 0) {
            System.out.print((index - min + 2) * min);
        } else {
            if (index == max) {
                for (int i = 2; i <= min; i++) {
                    sum = sum + (max - (max / i)) * (i - 1);
                }
            }
            System.out.print((index + 1 - (max / 2 - max / (yu + 1))) * (yu + 1));

        }
    }

    public static void traversal() {

    }
}
