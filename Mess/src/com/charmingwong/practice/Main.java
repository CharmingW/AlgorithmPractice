package com.charmingwong.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/7.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        ArrayList<ArrayList<String>> results = new ArrayList<>();
        String buffer;
        String[] nums;
        while (scanner.hasNextLine()) {
            buffer = scanner.nextLine();
            if (buffer.equals("")) break;
            nums = buffer.split(" ");
            a = Integer.parseInt(nums[0]);
            b = Integer.parseInt(nums[1]);
            if (b < a || a >= 999 && a <= 100 || b >= 999 && b <= 100) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("no");
                results.add(arrayList);
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = a; i <= b; i++) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int i1 = 0; i1 < s.length(); i1++) {
                    sum += Math.pow(Integer.parseInt(s.charAt(i1) + ""), 3);
                }
                if (sum == i) arrayList.add(i + "");
            }
            if (arrayList.size() == 0) arrayList.add("no");
            results.add(arrayList);
        }
        for (ArrayList<String> arrayList1 : results) {
            for (String s : arrayList1) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
