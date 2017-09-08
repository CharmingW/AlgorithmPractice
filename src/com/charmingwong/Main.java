package com.charmingwong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static String process(String[] input) {
        boolean[] booleans = new boolean[input.length];
        ArrayList<String> results = new ArrayList<>();
        out:
        for (int i = 0; i < input.length; i++) {
            if (!booleans[i]) {
                String s = input[i].replaceAll(" ", "");
                if ("self".equals(s)) {
                    results.add(i + "");
                    continue;
                }
                char[] chars = (i + s).toCharArray();
                Arrays.sort(chars);
                for (int j = 0; j < s.length(); j++) {
                    int index = Integer.parseInt(s.charAt(j) + "");
                    String temp = input[index].replaceAll(" ", "");
                    if ("self".equals(temp)) {
                        results.add(index + "");
                        booleans[index] = true;
                    }
                    char[] arr = (index + temp).toCharArray();
                    Arrays.sort(arr);
                    if (!Arrays.equals(arr, chars)) {
                        continue out;
                    }
                    booleans[index] = true;
                }
                results.add(new String(chars));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < results.size(); i++) {
            String result = results.get(i);
            for (int j = 0; j < result.length(); j++) {
                sb.append(result.charAt(j));
                if (j != result.length() - 1) {
                    sb.append(" ");
                }
            }
            if (i != results.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for (int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        res = process(_input);
        System.out.println(res);
    }
}