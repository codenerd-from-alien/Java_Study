package Java_Practice_pack;
import java.io.*;
import java.util.*;

public class java_paek_joon_1912 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		int arr[] = new int[number];
		int dp[] = new int[number];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int index = 0;
		/*백준에서 여러개 한줄로 스페이스 공백 있으면 토큰으로 짤라서 배열에 저장을 하는 방법*/
		
		while(st.hasMoreTokens()) {
			
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		dp[0] = arr[0];
		for(int i =1; i <number; i++) {
			
			dp[i]  = dp[i -1] + arr[i];
			if(dp[i -1] < 0) {
				dp[i] = arr[i];
			}
		}
		int max = dp[0];
		
		for(int i =0; i < number; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
			
			
		}
	
		System.out.println(max);
		
		
		
		
	}

}
