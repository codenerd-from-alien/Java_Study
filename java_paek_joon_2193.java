package Java_Practice_pack;
import java.util.*;
public class java_paek_joon_2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long dp[] = new long[10001];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i =3; i <=N ;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[N]);
		scn.close();
		
	}
}
