package datastructurefile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack; //스택 라이브러리 선언
import java.util.StringTokenizer;


public class java_paek_joon_10828 {

	public static void main(String[] args) throws IOException{ // 해줘야 readLine 사용가능
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i =0; i <num; i++ ) {
			StringTokenizer input = new StringTokenizer(bf.readLine());
			String s = input.nextToken();//토큰을 쪼갬
			
			if(s.equals("push")) {
				//스택에 숫자를 저장
				stack.push(Integer.parseInt(input.nextToken()));
				
			}
			
			if(s.equals("top")) {
				//스택 가장 위에 있는 정수를 출력을 하고 스택에 있는 정수가 없는 경우에는 -1을 출력
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.peek() + "\n");
				}
				
			} 
			if(s.equals("size")) {
				sb.append(stack.size() + "\n"); 
			}
			if(s.equals("empty")) {
				if(stack.isEmpty()) {
					 sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n"); 
				}
			}
			if(s.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.pop() + "\n");
				}
			}			
			
		}
		
		System.out.print(sb);
		
		bf.close();
		
		
	}

}
