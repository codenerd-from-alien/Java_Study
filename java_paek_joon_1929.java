package datastructurefile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.*;
import java.io.*;

public class java_paek_joon_1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int cnt =0;
		
		if(M == 1) {
			M =2;
		}
		
		for(int i = M; i <=N; i++) {
			
			for(int j =2; j *j <= i;j++) {
				if(i % j ==0) {
					cnt+=1;
				}
			}
			if(cnt == 0) {
				sb.append(i).append('\n');
			}
			cnt = 0;
		
		}
		
		
		System.out.print(sb);
		
		
		
	}

}
