package datastructurefile;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class java_paek_joon_10845_Queue {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(bf.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		int data =0;
		for(int i =0; i < num; i++) {
			StringTokenizer input = new StringTokenizer(bf.readLine());
			String s = input.nextToken();
			
			if(s.equals("push")) {
				data = Integer.parseInt(input.nextToken());
				queue.add(data);
				
			}
			
			if(s.equals("pop")) {
				if(!queue.isEmpty()) {
					sb.append(queue.remove()).append("\n");
					
				}else {
					sb.append("-1").append("\n");
				}
			}
			if(s.equals("size")) {
					sb.append(queue.size()).append("\n");
				
			}
			if(s.equals("empty")){
				if(!queue.isEmpty()) {
					sb.append("0").append("\n");
				}else{
					sb.append("1").append("\n");
				}
			}
			if(s.equals("front")) {
				if(!queue.isEmpty()) {
					sb.append(queue.peek()).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
			}
			if(s.equals("back")) {
				if(!queue.isEmpty()){
					sb.append(data).append("\n");
				}else {
					sb.append("-1").append("\n");
				}
				
			}
		}
		
		
		System.out.println(sb);
		
		
		
	}

}
