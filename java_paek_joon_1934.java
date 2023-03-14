package datastructurefile;
import java.io.*;

import java.util.StringTokenizer;


public class java_paek_joon_1934 {
	
	
	
	public static int GCD(int fst, int sec) {
		int f = fst;
		int s = sec;
		int tmp;
		
		if( s >f) {
			tmp = f;
			f =s;
			s =tmp;
		}
		
		if(s == 0) {
			return f;
		}else {
			return GCD(s, f %s);
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		for(int i =0; i < num; i++) {
			//문자열 한번에 입력을 받고 싶으면 StringTokenizer 클래스 사용해서 한줄 입력 받고 nextToken으로 잘라줘야 함
			st = new StringTokenizer(bf.readLine(), " ");
			//StringTokenizer가 루프 안에 안들어가 있으면 에러 남
			int number_first = Integer.parseInt(st.nextToken());
			int number_second = Integer.parseInt(st.nextToken());
			
			int result;
			
			result = number_first * number_second / GCD(number_first, number_second);
				
			sb.append(result).append("\n");
		}
		
		
		System.out.print(sb);
		
	
		
	}

}
