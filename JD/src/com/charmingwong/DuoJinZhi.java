package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class DuoJinZhi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int sum = 0;
            int temp = num;
            for (int i = 2; i <= num - 1; i++) {
                while (temp >= i) {
                    sum += temp % i;
                    temp = temp / i;
                }
                sum += temp;
                temp = num;
            }
            int maxCommonDivisor = maxCommonDivisor(sum, num - 2);
            System.out.println(sum / maxCommonDivisor + "/" + (num - 2) / maxCommonDivisor);
        }
    }

    public static int maxCommonDivisor(int m, int n) {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {// 若余数为0,返回最大公约数
            return n;
        } else { // 否则,进行递归,把n赋给m,把余数赋给n
            return maxCommonDivisor(n, m % n);
        }
    }
}
