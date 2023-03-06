package datastructurefile;

import java.io.*;
import java.util.Stack;
import java.util.Scanner;
//스택 수열 1바퀴 돌고 다시 풀어보기
public class java_paek_joon_1874_stack_sequence {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		
		int input_num = scan.nextInt();
	
		int init_num = 0;
		
		while(input_num -- > 0) {
			
		 	  int real_number = scan.nextInt();
			
		 	  if(real_number > init_num) {
		 		  
		 		  for(int j = init_num + 1 ; j <=real_number ; j++) {
		 			  stack.push(j);
		 			  sb.append("+").append("\n");
		 		  }
		 		  init_num = real_number;
		 		  
		 	  }
		
		 	  
		 	  
		 	  else if(stack.peek() != real_number ) {
		 		  System.out.println("NO");
		 		  return;
		 	  }
		 	  stack.pop();
	 		  sb.append("-").append("\n");
			
		}
		
		
		System.out.println(sb);
		
		
		
		scan.close();
		
	}

}
