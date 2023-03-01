package datastructurefile;
import java.io.*;
import java.util.Stack;




public class java_paek_joon_9093 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < num;i++) {
			String str = bf.readLine();
			
			
			for(int j =0; j < str.length(); j++) {
				stack.push(str.charAt(j));
				
				if(str.charAt(j) == ' ') {					
						while(!stack.isEmpty()) {
							sb.append(stack.pop());
						}
						/*스택에 넣은 후 큐로 데이터 넣는 법 생각하기*/
				}
				
				
			}
			
			sb.append('\n');
			
		}
		
		System.out.print(sb);
		
		bf.close();
	}

}
