package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/14.
 */
public class DeYueEr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String want = scanner.next();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                if (want.charAt(i) == '1') {
                    sum++;
                }
            } else {
                if (want.charAt(i) == '0') {
                    sum++;
                }
            }
        }
        System.out.printf("%.2f%%", Math.round(sum * 10000.0 / input.length()) / 100.0);
    }
}
