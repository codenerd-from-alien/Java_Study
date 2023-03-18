package datastructurefile;


import java.util.*;
import java.io.*;

public class java_paek_joon_Eratosthenes_1929 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num_first = Integer.parseInt(st.nextToken());
		int num_second = Integer.parseInt(st.nextToken());
		
		boolean Eratos_array[] = new boolean[num_second + 1]; //불린 변수 초기화 동시에 false로 값을 체움
		
		Eratos_array[0] = true;
		Eratos_array[1] = true;
		
		StringBuilder sb = new StringBuilder();
		
		//initializing the Eratos_array 
		for(int i =2; i * i <Eratos_array.length; i++) {
			//i * i를 하는 이유는 소수는 루트 i의 배수만큼 대열을 확인 해주면 되기 때문에
			if(Eratos_array[i]) {
				continue; //에라토스테네스 배열의 안에 수가 소수가 아니면 true
			}
			for(int j = i * i; j <Eratos_array.length; j += i) {
				Eratos_array[j] = true;
			}
			/* 2의 배수 즉 4부터 해서  6 8 10은 자동적으로 소수(prime number)가 아닌 것으로 판명이 나고
			 * 10이하의 소수에서 2, 5, 7제외하고는 전부 true가 됨
			 * 5이상의 배수에서는 예) 10 = 2 x 5이므로 이미 5 이상의 배수는 2 x 3으로 이루어지는 수는 5의 배수 이므로 true으로 초기화가 된다.*/
		}
		
		for(int i =num_first; i<=num_second; i++) {
			if(!Eratos_array[i]) {//에라토스 배열이 true가 아니면 그때는 배열의 번째는 소수이다.
				sb.append(i).append('\n');
			}
		}
		
		
		
		
		

	}

}
