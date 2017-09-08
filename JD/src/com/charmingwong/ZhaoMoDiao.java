package com.charmingwong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/7/17.
 */
public class ZhaoMoDiao {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        if (count == 1) {
            if (nums[0] > 1) {
                System.out.println((nums[0] - 1) + " " + (nums[0] + 1));
            } else {
                System.out.println(nums[0] + 1);
            }
            return;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("mistake");
                return;
            }
        }

        int distance = nums[count - 1] - nums[0];
        if (distance > count) {
            System.out.println("mistake");
        } else {
            if (distance == count) {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i + 1] - nums[i] > 1) {
                        System.out.println(nums[i] + 1);
                    }
                }
            } else {
                if (nums[0] == 1) {
                    System.out.println(nums[count - 1] + 1);
                } else {
                    System.out.println((nums[0] - 1) + " " + (nums[count - 1] + 1));
                }
            }
        }
    }
}
