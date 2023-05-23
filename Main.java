package org.example;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs = br.readLine().split(" ");
        int inc= Integer.parseInt(strs[0]);//2
        int de = Integer.parseInt(strs[1]);//1
        int h = Integer.parseInt(strs[2]);//5

        int day = (h - de) /(inc -de);

        if((h - de) % (inc -de)  !=0){
            day+=1;
        }


        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();

    }
}