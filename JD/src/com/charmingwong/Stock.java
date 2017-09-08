package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/14.
 */
public class Stock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int days = scanner.nextInt();
            int sum = 0;
            int i = 0;
            while (sum <= days) {
                i++;
                sum += i;
            }
            System.out.println(days - (i-2) * 2);
        }
    }
}
