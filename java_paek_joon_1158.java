package datastructurefile;
import java.util.*;
import java.io.*;
import java.util.Scanner;
public class java_paek_joon_1158 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("<");
		Scanner sc = new Scanner(System.in);
		String param =sc.nextLine();
		
		int N = Integer.parseInt(param.split(" ")[0]);
		int K = Integer.parseInt(param.split(" ")[1]);
		
		
		Deque<Integer> que = new ArrayDeque<>();
		
		for(int i =1; i <= N; i++) {
			que.offer(i);
		}
		
		while(que.size() != 1) {
			for(int i =1; i < K; i++) {
				que.addLast(que.removeFirst());
			}
			sb.append(que.removeFirst()).append(", ");
		}
		if(que.size() == 1) {
			sb.append(que.removeFirst()).append(">");
		}
		
		System.out.println(sb);
		
		sc.close();
		
		
		
		
	}

}
