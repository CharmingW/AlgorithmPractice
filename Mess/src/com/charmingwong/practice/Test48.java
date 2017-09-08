package com.charmingwong.practice;

import java.util.ArrayList;

/**
 * Created by CharmingWong on 2017/4/8.
 */
public class Test48 {

    public static void main(String[] args) {
        Test48 test48 = new Test48();
        test48.Permutation("abc");
    }

    private ArrayList<String> strings = new ArrayList<>();
    private ArrayList<Integer> indexes = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();
    private char[] chars;

    public ArrayList<String> Permutation(String str) {
        chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            indexes.add(i);
        }
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            indexes.remove(((Integer) i));
            sb.delete(0, sb.length());
            traversal();
        }
        System.out.print(strings);
        return strings;
    }

    private void traversal() {
        if (indexes.size() <= 1) {
            sb.append(chars[indexes.get(0)]);
            strings.add(sb.toString());
            sb.delete(sb.length() - 2, sb.length());
            indexes.add(sb.length() - 2);
            return;
        }
        for (int i = 0; i < indexes.size(); i++) {
            sb.append(chars[indexes.get(i)]);
            indexes.remove((indexes.get(i)));
            traversal();
        }

    }

}
