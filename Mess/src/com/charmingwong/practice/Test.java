package com.charmingwong.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by CharmingWong on 2017/3/22.
 */
public class Test {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(60000);
            Socket socket = ss.accept();
            InputStream inputStream = socket.getInputStream();
            byte buffer[] = new byte[4 * 1024];
            int temp = 0;
            StringBuffer sb = new StringBuffer();
            while ((temp = inputStream.read(buffer)) != -1) {
                sb.append(buffer.toString());
            }
            ss.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
