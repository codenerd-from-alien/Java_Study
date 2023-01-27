package algo_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.Math;
public class java_paek_joon_2869 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] strs = br.readLine().split(" ");
		int increase = Integer.parseInt(strs[0]);
		int decrease = Integer.parseInt(strs[1]);
		int height = Integer.parseInt(strs[2]);
		
		int day = (height - decrease) / ( increase - decrease ); 
		
		if((height - decrease) % (increase - decrease) !=0) {
			day++;
		}
		
	
		
		bw.write(String.valueOf(day));
		bw.close();
		
		br.close();
		
		
	}

}
