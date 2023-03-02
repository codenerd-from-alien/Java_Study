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
			String str = bf.readLine() + '\n';//개행 문자도 입력받는 법 생각하기
			
			
			
			for(int j =0; j < str.length(); j++) {
				if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {//개행 문자 받는 조건을 넣었어야함
					while(!stack.isEmpty()) {
						sb.append(stack.peek());
						stack.pop();
					}
					
					if(stack.isEmpty() && str.charAt(j) ==' ') {
						sb.append(' '); //반복문이 완전히 실행이 되어서 스택이 비어있고 빈문자열을 만나면 빈 공간 추가
					}
				}else {
					stack.push(str.charAt(j));
				}
				
			}
			
			sb.append('\n');
			
		}
		
		System.out.print(sb);
		
		bf.close();
	}

}
