package datastructurefile;

import java.util.*;
import java.io.*;
public class java_paek_joon_9095 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(bf.readLine());
		int result[] = new int[11];
		
		int get_index[] = new int[number];
		
		for(int i =0; i < number; i++) {
			
			int input_val = Integer.parseInt(bf.readLine());
			result[0] =1; result[1] = 2; result[2] = 4;
			
			get_index[i] += input_val;
			
			if(input_val >= 4) {
				
				for(int j = 3; j < input_val; j++) {
					
					result[j] = result[j-3] + result[j-2] + result[j-1];
				}
				
				
			}
			
		}
		
		
		for(int i =0; i <get_index.length;i++) {
			
			System.out.println(  result[get_index[i] - 1]   );
			
		}
		
		
		
		
		
		
		
	}

}
