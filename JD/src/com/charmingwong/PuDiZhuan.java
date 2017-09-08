package com.charmingwong;

import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/4/13.
 */
public class PuDiZhuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        long width, height, size, piece;
        for (int i = 0; i < count; i++) {
            width = scanner.nextInt();
            height = scanner.nextInt();
            size = scanner.nextInt();
            piece = ((width % size == 0) ? (width / size) : (width / size + 1))
                    * ((height % size == 0) ? (height / size) : (height / size + 1));
            System.out.println(piece);
        }
    }
}
