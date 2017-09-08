package com.charmingwong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/7/17.
 */
public class HuiWenChuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();
        String dw = scanner.nextLine();
        List<String> strs = new ArrayList<>();
        strs.add(dw);
        for (int i = 0; i < wordCount - 1; i++) {
            String word = scanner.nextLine();
            boolean isContained = false;
            for (String str : strs) {
                if (str.length() == word.length() && (str + str).contains(word)) {
                    isContained = true;
                    break;
                }
            }
            if (!isContained) {
                strs.add(word);
            }
        }
        System.out.println(strs.size());
    }
}
