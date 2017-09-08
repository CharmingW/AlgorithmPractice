package com.charmingwong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/14.
 */
public class LuDeng {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lightCount = scanner.nextInt();
        int len = scanner.nextInt();
        int[] locations = new int[lightCount];
        for (int i = 0; i < lightCount; i++) {
            locations[i] = scanner.nextInt();
        }
        Arrays.sort(locations);
        double minD = 0;
        for (int i = 0; i < locations.length - 1; i++) {
            if (minD < locations[i + 1] - locations[i]) {
                minD = locations[i + 1] - locations[i];
            }
        }
        minD = Math.max(Math.max(locations[0] - 0, len - locations[locations.length - 1]), minD / 2);
        System.out.printf("%.2f", Math.round(minD * 100) / 100.0);
    }
}
