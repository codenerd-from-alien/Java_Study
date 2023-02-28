package datastructurefile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack; //���� ���̺귯�� ����
import java.util.StringTokenizer;


public class java_paek_joon_10828 {

	public static void main(String[] args) throws IOException{ // ����� readLine ��밡��
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i =0; i <num; i++ ) {
			StringTokenizer input = new StringTokenizer(bf.readLine());
			String s = input.nextToken();//��ū�� �ɰ�
			
			if(s.equals("push")) {
				//���ÿ� ���ڸ� ����
				stack.push(Integer.parseInt(input.nextToken()));
				
			}
			
			if(s.equals("top")) {
				//���� ���� ���� �ִ� ������ ����� �ϰ� ���ÿ� �ִ� ������ ���� ��쿡�� -1�� ���
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
