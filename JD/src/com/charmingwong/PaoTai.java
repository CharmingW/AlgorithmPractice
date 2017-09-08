package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/14.
 */
public class PaoTai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        int sum = 0;
        if (Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1)) <= r)
            sum++;
        if (Math.sqrt((x0 - x2) * (x0 - x2) + (y0 - y2) * (y0 - y2)) <= r)
            sum++;
        if (Math.sqrt((x0 - x3) * (x0 - x3) + (y0 - y3) * (y0 - y3)) <= r)
            sum++;
        System.out.print(sum + "X");
    }
}
