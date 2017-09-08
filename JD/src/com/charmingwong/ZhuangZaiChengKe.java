package com.charmingwong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class ZhuangZaiChengKe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int size = scanner.nextInt();
        int busNum = 1, num = 0, temp = 0;
        for (int i = 0; i < count; i++) {
            num = scanner.nextInt();
            temp += num;
            if (temp > size) {
                busNum++;
                temp = num;
            }
        }
        System.out.print(busNum);
    }
}
