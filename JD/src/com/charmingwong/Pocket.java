package com.charmingwong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pocket {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static String process(String pocket, String card) {
        if (pocket == null || "".equals(pocket) || card == null || "".equals(card)) {
            return "";
        }
        char[] chars = {'3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K', 'A', '2'};
        char[] pockets = pocket.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 1;
        for (int i = 0; i < pockets.length; i++) {
            if (map.containsKey(pockets[i])) {
                int temp = map.get(pockets[i]) + 1;
                map.put(pockets[i], temp);
                if (temp > max) {
                    max = temp;
                }
            } else {
                map.put(pockets[i], 1);
            }
        }
        int len = card.length();
        char c = card.charAt(0);
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                index = i;
            }
        }
        for (int i = index + 1; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int l = map.get(chars[i]);
                if (l == len) {
                    StringBuilder result = new StringBuilder();
                    for (int j = 0; j < len; j++) {
                        result.append(chars[i]);
                    }
                    return result.toString();
                }
            }
        }
        for (int i = index + 1; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int l = map.get(chars[i]);
                if (l > len) {
                    StringBuilder result = new StringBuilder();
                    for (int j = 0; j < len; j++) {
                        result.append(chars[i]);
                    }
                    return result.toString();
                }
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if (characterIntegerEntry.getValue() == max) {
                for (int i = 0; i < chars.length; i++) {
                    if (characterIntegerEntry.getKey() == chars[i]) {
                        if (i < minIndex) {
                            minIndex = i;
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            sb.append(chars[minIndex]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _pocket;
        try {
            _pocket = in.nextLine();
        } catch (Exception e) {
            _pocket = null;
        }

        String _card;
        try {
            _card = in.nextLine();
        } catch (Exception e) {
            _card = null;
        }

        res = process(_pocket, _card);
        System.out.println(res);
    }
}