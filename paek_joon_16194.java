package Java_Practice_pack;
import java.util.*;
public class paek_joon_16194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new  Scanner(System.in);
		int number = scan.nextInt();
		int arr[] = new int[number +1];
		int dp[] = new int[number +1];
		
		arr[0] = 0;
		dp[0] =0;
		
		for(int i =1; i<= number ;i++) {
			dp[i] = 10001;
		}
		
		
		
		for(int i =1; i<= number; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i =1; i <= number; i++) {
			
			for(int j =1; j<= i ;j++) {
				
				if(dp[i] > dp[i -j] +arr[j]) {
					dp[i] = dp[i -j] + arr[j];
				}
				
			}			
		}
		
		
		System.out.println(dp[number]);
			
			
		
		
		
		
	}

}
