package org.example;

import java.util.Scanner;
import java.util.Stack;

public class java_paek_joon_10773 {
    public static void main(String args[]){
        Stack<Integer>  stack= new Stack<>();
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();

        for(int i =0; i < number; i++){
            int input_val = scn.nextInt();

            if(input_val !=0){
                stack.push(input_val);
            }
            else if(input_val == 0){
                stack.pop();
            }
        }
        int sum =0;
        for(int i =0; i <stack.size(); i++){
            sum += stack.get(i);
        }

        System.out.println(sum);



    }
}
