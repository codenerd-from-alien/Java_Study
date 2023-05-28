package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;



public class java_hanghae_assignment_2 {
    public static  void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<String> lines = new LinkedList<>();


        String Set = bf.readLine();

        if(Set.equals("Set")) {
            String reci = bf.readLine();
            sb.append("[ ").append(Set + " 으로 저장된 ").append(reci).append(" ]").append('\n');
            while (true){
                String line_by_line_input = scn.nextLine();
                lines.add(line_by_line_input);
                if(line_by_line_input.equals("끝")){
                    break;
                }
            }
        }
        for(int i =0; i < lines.size() -1; i++){
            sb.append((i + 1) + ". ").append(lines.get(i)).append('\n');
        }

        System.out.println(sb);
    }


}
