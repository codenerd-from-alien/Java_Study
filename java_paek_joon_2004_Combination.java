package datastructurefile;

import java.util.*;
import java.io.*;

/*팩토리얼 문제와 조합 0의 갯수 세는 문제는 암기를 할 필요성이 보임*/
public class java_paek_joon_2004_Combination {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		long N = in.nextLong(); // 정수 N, M의 크기의 범위는 0에서 부터 2,000,000,000이다
		long M = in.nextLong();
		
		/* !10 의 뒤에의 0의 갯수는 5로 나누 었을 때 혹은 2로 나누엇을 때 둘의 최소값에서 팩토리얼의 0의 갯수가 판별이된다.*/
		//수학의 수식으로 정리를 하면 2의(a-b-c)승과 5의(a-b-c)승의 값의 곱에서 2와 5중에 최소승수
		//즉 제일 작은 승수에서 숫자의 0의 갯수가 판정이 된다.
		//문제의 요구 사항은 특정 팩토리얼 정수의 2와 5로 나눈 값의 최소값을 구해야한다.
		
		long count_5 = five_of_power_n(N) - five_of_power_n(N -M) - five_of_power_n(M);
		long count_2 = two_of_power_n(N) - two_of_power_n(N - M) -two_of_power_n(M);
		
		//조합 공식에서 분자 위의 5**n승 에서 분모 팩토리얼 5**N - M승 5**M승을 가각 n-m, m승 빼주면서
		//마찬가지로 2승도 같게 구해주면 된다.
		
		
		
		if(count_5 > count_2) {
			System.out.println(count_2);
		}else {
			System.out.println(count_5);
		}
		
		in.close();
		
	}
	
	public static long five_of_power_n(long number) {
		int count =0; //매개 변수로 받은 팩토리얼 번호를 나눈 몫을 5가 총 몇개인지 알기 위해 0으로 초기화
		while(number >= 5) {
			count+= number/5;
			number = number /5;//특정 팩토리얼 수의 몫이 5 이상일 때만 돌리기 위해서 몫을 나눈다.
		}
		
		return count;
	}
	
	public static long two_of_power_n(long number) {
		int count =0;
		
		while(number >=2) {
			count += number / 2; //특정 팩토리얼의 값에서 2로 나눈 나머지를 알기 위해서
			number = number/ 2;
		}
		
		return count;
	}
}
