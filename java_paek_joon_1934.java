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
			//���ڿ� �ѹ��� �Է��� �ް� ������ StringTokenizer Ŭ���� ����ؼ� ���� �Է� �ް� nextToken���� �߶���� ��
			st = new StringTokenizer(bf.readLine(), " ");
			//StringTokenizer�� ���� �ȿ� �ȵ� ������ ���� ��
			int number_first = Integer.parseInt(st.nextToken());
			int number_second = Integer.parseInt(st.nextToken());
			
			int result;
			
			result = number_first * number_second / GCD(number_first, number_second);
				
			sb.append(result).append("\n");
		}
		
		
		System.out.print(sb);
		
	
		
	}

}
