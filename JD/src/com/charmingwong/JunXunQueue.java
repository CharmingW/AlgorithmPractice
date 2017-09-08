package com.charmingwong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class JunXunQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int size = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j <= size; j++) {
                list.add(j);
            }
            while (list.size() > 3) {
                for (int n = 1; n < list.size() && list.size() >= 3; n++) {
                    list.remove(n);
                }
                if (list.size() > 3) {
                    for (int m = 2; m < list.size() && list.size() >= 3; m += 2) {
                        list.remove(m);
                    }
                }
            }
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
