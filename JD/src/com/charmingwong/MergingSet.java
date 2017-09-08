package com.charmingwong;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class MergingSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        while (scanner.hasNext()) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            for (int i = 0; i < first; i++) {
                hashSet.add(scanner.nextInt());
            }
            for (int i = 0; i < second; i++) {
                hashSet.add(scanner.nextInt());
            }
            Object[] objects = hashSet.toArray();
            Arrays.sort(objects);
            for (Object object : objects) {
                System.out.print(object + " ");
            }
            hashSet.clear();
        }
    }
}
