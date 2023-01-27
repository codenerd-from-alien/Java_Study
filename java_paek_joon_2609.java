package algo_practice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class java_paek_joon_2609 {

	
	public static int gcd(int num1, int num2) {//최대공약수는 큰 것에서 작은 것을 나누어서 나눈 나머지가 0이 되는 값이 최대공약수임
		int tmp,n;
		if(num1 < num2) {
			tmp= num1;
			num1 = num2;
			num2 =tmp;
		}
		
		while(num2 !=0) {
			n = num1 % num2;
			num1 = num2;
			num2 = n;
		}
		
		return num1;
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] strs = br.readLine().split(" ");
		int num1 = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		
		
		bw.write(String.valueOf(gcd(num1,num2)));
		bw.write("\n");
		bw.write(String.valueOf(num1 *num2 / gcd(num1,num2)));//최소공배수는 최소공배수를 알려는 두수의 곱의 최대공약수에서 나눈 값이다.
		bw.close();
		
		
		br.close();
	}

}
