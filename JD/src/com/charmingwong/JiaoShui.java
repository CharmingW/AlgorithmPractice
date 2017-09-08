package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/14.
 */
public class JiaoShui {

    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] radius = new int[count];
        for (int i = 0; i < count; i++) {
            radius[i] = scanner.nextInt();
        }
    }
}
