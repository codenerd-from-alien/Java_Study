package datastructurefile;
import java.io.*;
import java.util.*;

public class java_paek_joon_10866_deque {
	public static void main(String args[]) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(bf.readLine());
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		for(int i =0; i < num; i++) {
			StringTokenizer input = new StringTokenizer(bf.readLine());
			String s = input.nextToken();
			
			if(s.equals("push_front")) {
				deque.addFirst(Integer.parseInt(input.nextToken()));
			}
			if(s.equals("push_back")) {
				deque.addLast(Integer.parseInt(input.nextToken()));
			}
			if(s.equals("pop_front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(deque.removeFirst()).append("\n");
				}
			}
			if(s.equals("pop_back")) {
				if(deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(deque.removeLast()).append("\n");
				}
			}
			if(s.equals("size")) {
				sb.append(deque.size()).append("\n");
			}
			if(s.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}
			if(s.equals("front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(deque.getFirst()).append("\n");
				}
			}
			
			if(s.equals("back")) {
				if(deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(deque.getLast()).append("\n");
				}
			}
		}
		
		
		System.out.println(sb);
		bf.close();
		
	}
}
