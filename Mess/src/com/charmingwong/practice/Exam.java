package com.charmingwong.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CharmingWong on 2017/7/12.
 */
public class Exam {


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 1, 4, 8, 2, 7, 5, 4, 10, 6, 5, 9};
        findCommonNum(arr);
    }

    private static void findCommonNum(int[] arr) {

        //创建一个HashMap记录出现过的数字以及出现的次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int element : arr) {
            if (!hashMap.containsKey(element)) {
                //首次出现的数字，放进HashMap中，并标记个数为1
                hashMap.put(element, 1);
            } else {
                //element之前出现的次数
                int lastCount = hashMap.get(element);
                //再次出现，更新出现的次数+1
                hashMap.put(element, lastCount + 1);
            }
        }

        //遍历HashMap中每一个条目，按照出现的次数打印出每个数字
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int count = entry.getValue();
            if (count > 1) {
                for (int i = 0; i < count; i++) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }
}
