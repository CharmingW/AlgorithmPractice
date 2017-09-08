package com.charmingwong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/16.
 */
public class RiQiDaoJi {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        Calendar c = Calendar.getInstance();
        Date today = new SimpleDateFormat("yyyy年MM月dd日").parse("1995年7月7日");
        Date d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        long days = d.getTime() - today.getTime();
        System.out.print(days / (1000 * 3600 * 24));
    }
}
