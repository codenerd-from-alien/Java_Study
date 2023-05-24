package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class java_paek_joon_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();


        int num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int last_number = 0;
        for(int i =0;i < num ;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String val = st.nextToken();

            if (que.isEmpty()){
                last_number =0;
            }

            if(val.contains("push")){
                int number = Integer.parseInt(st.nextToken());
                que.offer(number);
                last_number = number;
            }else if(val.contains("pop")){
                if(que.isEmpty()){
                    sb.append("-1").append("\n");
                    last_number =0;
                }else{
                    sb.append( que.remove() ).append("\n");
                }
            }else if(val.contains("size")){
                sb.append(que.size()).append("\n");
            }else if(val.contains("empty")){
                if(que.isEmpty()){
                    sb.append("1").append("\n");
                    last_number =0;
                }else{
                    sb.append("0").append("\n");
                }
            } else if (val.contains("front")) {
                if(que.isEmpty()){
                    sb.append("-1").append("\n");
                    last_number =0;
                }else{
                    sb.append(que.peek()).append("\n");
                }
            }else if(val.contains("back")){
                if (que.isEmpty()){
                    sb.append("-1").append("\n");
                }else if(last_number != 0){
                    sb.append(last_number).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
