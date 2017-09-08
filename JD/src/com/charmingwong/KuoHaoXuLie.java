package com.charmingwong;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by CharmingWong on 2017/4/15.
 */
public class KuoHaoXuLie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            String sequence = scanner.next();
            Pattern pattern = Pattern.compile("\\?+");
            Matcher matcher = pattern.matcher(sequence);
            if (matcher.find()) {
                int size = matcher.end() - matcher.start();
                if (size % 2 == 0) {
                    int sum = 0;
                    sb.append('(');
                    for (int i = 0; i < size / 2; i++) {
                        scanner.next();
                        sum += scanner.nextInt();
                        sum += scanner.nextInt();
                        scanner.next();
                        sb.append(")(");
                    }
                    System.out.println(sum);
                    sb.append(')');
                    System.out.println(sb.toString());
                    sb.delete(0, sb.length());
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
