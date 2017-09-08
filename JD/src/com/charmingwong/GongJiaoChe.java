package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class GongJiaoChe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stopSize = scanner.nextInt();
        int on = 0;
        int off = 0;
        int max = 0;
        for (int i = 0; i < stopSize; i++) {
            off += scanner.nextInt();
            on += scanner.nextInt();
            if (max < on - off) {
                max = on - off;
            }
        }
        System.out.print(max);
    }
}
