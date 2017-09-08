package com.charmingwong.practice;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by CharmingWong on 2017/3/21.
 */
public class FishTest {

    public static void main(String[] args) {


        try {
            Socket socket = new Socket("127.0.0.1", 60000);
            InputStream inputStream = new FileInputStream("d://a.txt");
            OutputStream outputStream = socket.getOutputStream();
            byte buffer[] = new byte[4 * 1024];
            int temp = 0;
            while ((temp = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, temp);
            }
            outputStream.flush();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
