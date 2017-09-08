package com.charmingwong;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class BanYuanZhuo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long x1 = scanner.nextInt();
        long y1 = scanner.nextInt();
        double d = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        if (d % (2 * r) == 0) {
            System.out.print((int) (d / (2 * r)));
        } else {
            System.out.print((int) (d / (2 * r)) + 1);
        }
    }
}
