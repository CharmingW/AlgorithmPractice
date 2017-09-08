package com.charmingwong;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by CharmingWong on 2017/4/15.
 */
public class BiaoHaoZhuanHuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String encode;
        Pattern pattern;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            encode = scanner.next();
            pattern = Pattern.compile("R[0-9]+C[0-9]+");
            if (pattern.matcher(encode).find()) {
                int r = Integer.parseInt(encode.substring(1, encode.indexOf('C')));
                int c = Integer.parseInt(encode.substring(encode.indexOf('C') + 1, encode.length()));
                while (c >= 26) {
                    if (c % 26 != 0) {
                        sb.append((char) (c % 26 + 64));
                        c = c / 26;
                    } else {
                        sb.append('Z');
                        c = c / 26;
                        c--;
                    }
                }
                if (c != 0) {
                    sb.append((char) (c + 64));
                }
                sb.reverse();
                sb.append(r);
            } else {
                pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(encode);
                if (matcher.find()) {
                    String c = encode.substring(0, matcher.start());
                    int cSize = 0;
                    for (int i1 = 0; i1 < c.length(); i1++) {
                        cSize += (c.charAt(i1) - 64) * Math.pow(26, c.length() - i1 - 1);
                    }
                    sb.append('R');
                    sb.append(encode.substring(matcher.start(), encode.length()));
                    sb.append('C');
                    sb.append(cSize);
                }
            }
            System.out.println(sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
