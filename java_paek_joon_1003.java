package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class java_paek_joon_1003 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(bf.readLine());

        for(int i =0; i <T; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int val = Integer.parseInt(st.nextToken());

            if(val == 0){
                sb.append("1").append(" ").append("0").append('\n');
            }else if(val ==1){
                sb.append("0").append(" ").append("1").append("\n");
            }else{

                int count_one[] = new int[val+1];
                count_one[0] = 0;
                count_one[1] = 1;
                int count_zero[] = new int[val +1];
                count_zero[0] = 1;
                count_zero[1] = 0;
                for(int j =2; j <=val; j++){
                    count_zero[j] = count_one[j-1];
                    count_one[j] = count_one[j-1] + count_zero[j-1];
                }
                sb.append(count_zero[val]).append(" ").append(count_one[val]).append('\n');
            }

        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }


}
