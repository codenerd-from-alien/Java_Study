package datastructurefile;
import java.util.*;
import java.io.*;
import java.math.*;

public class java_paek_joon_1676 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		BigInteger result = new BigInteger("1");
		//입력값이 500이상이면 int 정수형의 데이터 표현의 범위를 벗어난다.
		//int 형 정수의 숫자 표현 범위는 -2,147,483,648 ~ 2,147,483,647
		//이 범위를 벗어난다면 bigIntger 클래스를 활용하는 것이 좋다...
		for(int i =num; i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		String changed_value;
		
		changed_value = String.valueOf(result);
		int cnt = 0;
		for(int i =changed_value.length()-1; i >=0 ; i--) {
			if(changed_value.charAt(i) == '0') {
				cnt+=1;
			}else {
				break;
			}
			
			
		}
		
		if(num <=4) {
			System.out.print(0);
		}else {
			System.out.print(cnt);
		}
		
		
		
		
		
		
		
	}

}
