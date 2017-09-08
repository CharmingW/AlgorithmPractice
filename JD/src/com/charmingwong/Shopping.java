package com.charmingwong;

import java.util.*;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class Shopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int goodsType = scanner.nextInt();
            int willBuyType = scanner.nextInt();
            int[] prices = new int[goodsType];
            for (int i = 0; i < goodsType; i++) {
                prices[i] = scanner.nextInt();
            }
            Arrays.sort(prices);
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            for (int i = 0; i < willBuyType; i++) {
                String key = scanner.next();
                if (hashMap.containsKey(key)) {
                    hashMap.put(key, hashMap.get(key) + 1);
                } else {
                    hashMap.put(key, 1);
                }
            }
            Object[] willBuyCount = hashMap.values().toArray();
            Arrays.sort(willBuyCount);
            int min = 0, max = 0;
            for (int i = 0; i < willBuyCount.length; i++) {
                min += prices[i] * ((int) willBuyCount[willBuyCount.length - 1 - i]);
                max += prices[prices.length - 1 - i] * ((int) willBuyCount[willBuyCount.length - 1 - i]);
            }
            System.out.print(min + " " + max);
            System.out.println();
        }
    }
}
