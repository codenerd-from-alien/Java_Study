package datastructurefile;
import java.util.*;
import java.io.*;
import java.math.*;

public class java_paek_joon_1676 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		BigInteger result = new BigInteger("1");
		//�Է°��� 500�̻��̸� int �������� ������ ǥ���� ������ �����.
		//int �� ������ ���� ǥ�� ������ -2,147,483,648 ~ 2,147,483,647
		//�� ������ ����ٸ� bigIntger Ŭ������ Ȱ���ϴ� ���� ����...
		for(int i =num; i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		String changed_value;
		
		changed_value = String.valueOf(result);
		int cnt = 0;
		for(int i =changed_value.length()-1; i >=0 ; i--) {
			if(changed_value.charAt(i) == '0') {
				cnt+=1;
			}else {
				break;
			}
			
			
		}
		
		if(num <=4) {
			System.out.print(0);
		}else {
			System.out.print(cnt);
		}
		
		
		
		
		
		
		
	}

}
