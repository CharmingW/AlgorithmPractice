package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class ShangTaiJie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.println(0);
                continue;
            }
            if (m == 2) {
                System.out.println(1);
                continue;
            }
            int doub = (m - 1) / 2;
            long sum = 1;
            for (int j = 1; j <= doub; j++) {
                int single = m - j * 2 - 1;
                long temp = 1;
                if (single != 0) {
                    for (int k = 1; k <= j; k++) {
                        temp *= (single + k);
                    }
                    for (int k = 1; k <= j; k++) {
                        temp /= k;
                    }
                    sum += temp;
                } else {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
