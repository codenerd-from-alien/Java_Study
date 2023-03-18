package datastructurefile;


import java.util.*;
import java.io.*;

public class java_paek_joon_Eratosthenes_1929 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num_first = Integer.parseInt(st.nextToken());
		int num_second = Integer.parseInt(st.nextToken());
		
		boolean Eratos_array[] = new boolean[num_second + 1]; //�Ҹ� ���� �ʱ�ȭ ���ÿ� false�� ���� ü��
		
		Eratos_array[0] = true;
		Eratos_array[1] = true;
		
		StringBuilder sb = new StringBuilder();
		
		//initializing the Eratos_array 
		for(int i =2; i * i <Eratos_array.length; i++) {
			//i * i�� �ϴ� ������ �Ҽ��� ��Ʈ i�� �����ŭ �뿭�� Ȯ�� ���ָ� �Ǳ� ������
			if(Eratos_array[i]) {
				continue; //�����佺�׳׽� �迭�� �ȿ� ���� �Ҽ��� �ƴϸ� true
			}
			for(int j = i * i; j <Eratos_array.length; j += i) {
				Eratos_array[j] = true;
			}
			/* 2�� ��� �� 4���� �ؼ�  6 8 10�� �ڵ������� �Ҽ�(prime number)�� �ƴ� ������ �Ǹ��� ����
			 * 10������ �Ҽ����� 2, 5, 7�����ϰ�� ���� true�� ��
			 * 5�̻��� ��������� ��) 10 = 2 x 5�̹Ƿ� �̹� 5 �̻��� ����� 2 x 3���� �̷������ ���� 5�� ��� �̹Ƿ� true���� �ʱ�ȭ�� �ȴ�.*/
		}
		
		for(int i =num_first; i<=num_second; i++) {
			if(!Eratos_array[i]) {//�����佺 �迭�� true�� �ƴϸ� �׶��� �迭�� ��°�� �Ҽ��̴�.
				sb.append(i).append('\n');
			}
		}
		
		
		
		
		

	}

}
