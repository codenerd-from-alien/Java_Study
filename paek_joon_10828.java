package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class paek_joon_10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i<num; i++){

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String val = st.nextToken();
            if(val.contains("push")){
                int number = Integer.parseInt(st.nextToken());
                stack.push(number);
            }else if(val.contains("pop")){

                if(stack.empty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(String.valueOf(stack.pop())).append("\n");
                }
            }else if(val.contains("size")){
                sb.append(stack.size()).append("\n");
            }else if(val.contains("empty")){
                if(stack.empty()){
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(val.contains("top")){
                if(stack.empty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(String.valueOf(stack.peek())).append("\n");
                }
            }

        }

        System.out.println(sb);

    }
}
