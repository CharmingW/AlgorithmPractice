package com.charmingwong.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by CharmingWong on 2017/3/25.
 */
public class IpTest {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])$");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.print("is an ip address");
        } else {
            System.out.print("is not an ip address");
        }

    }
}
