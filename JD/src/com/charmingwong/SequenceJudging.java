package com.charmingwong;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class SequenceJudging {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        String a = new String(scanner.next().getBytes(), "utf-8");
        String b = new String(scanner.next().getBytes(), "utf-8");
        Pattern pattern;
        Matcher matcher;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            sb.append(b.charAt(i));
            if (i == b.length() - 1 || b.charAt(i) != b.charAt(i + 1)) {
                pattern = Pattern.compile(sb.toString());
                matcher = pattern.matcher(a);
                if (!matcher.find()) {
                    System.out.print(String.valueOf(0));
                    return;
                }
                sb.delete(0, sb.length());
            }
        }
        System.out.print(String.valueOf(1));
    }
}
