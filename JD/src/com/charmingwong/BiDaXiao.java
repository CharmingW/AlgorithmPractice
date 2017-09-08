package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class BiDaXiao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum;
        out:
        for (int i = 1; ; i++) {
            sum = i * n + 1;
            for (int j = 0; j < n - 1; j++) {
                if (sum % (n - 1) == 0) {
                    sum = sum * n / (n - 1) + 1;
                } else {
                    continue out;
                }
            }
            System.out.print(sum);
            break;
        }
    }

}
