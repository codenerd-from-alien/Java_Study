package datastructurefile;

import java.util.*;
import java.io.*;

/*���丮�� ������ ���� 0�� ���� ���� ������ �ϱ⸦ �� �ʿ伺�� ����*/
public class java_paek_joon_2004_Combination {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		long N = in.nextLong(); // ���� N, M�� ũ���� ������ 0���� ���� 2,000,000,000�̴�
		long M = in.nextLong();
		
		/* !10 �� �ڿ��� 0�� ������ 5�� ���� ���� �� Ȥ�� 2�� �������� �� ���� �ּҰ����� ���丮���� 0�� ������ �Ǻ��̵ȴ�.*/
		//������ �������� ������ �ϸ� 2��(a-b-c)�°� 5��(a-b-c)���� ���� ������ 2�� 5�߿� �ּҽ¼�
		//�� ���� ���� �¼����� ������ 0�� ������ ������ �ȴ�.
		//������ �䱸 ������ Ư�� ���丮�� ������ 2�� 5�� ���� ���� �ּҰ��� ���ؾ��Ѵ�.
		
		long count_5 = five_of_power_n(N) - five_of_power_n(N -M) - five_of_power_n(M);
		long count_2 = two_of_power_n(N) - two_of_power_n(N - M) -two_of_power_n(M);
		
		//���� ���Ŀ��� ���� ���� 5**n�� ���� �и� ���丮�� 5**N - M�� 5**M���� ���� n-m, m�� ���ָ鼭
		//���������� 2�µ� ���� �����ָ� �ȴ�.
		
		
		
		if(count_5 > count_2) {
			System.out.println(count_2);
		}else {
			System.out.println(count_5);
		}
		
		in.close();
		
	}
	
	public static long five_of_power_n(long number) {
		int count =0; //�Ű� ������ ���� ���丮�� ��ȣ�� ���� ���� 5�� �� ����� �˱� ���� 0���� �ʱ�ȭ
		while(number >= 5) {
			count+= number/5;
			number = number /5;//Ư�� ���丮�� ���� ���� 5 �̻��� ���� ������ ���ؼ� ���� ������.
		}
		
		return count;
	}
	
	public static long two_of_power_n(long number) {
		int count =0;
		
		while(number >=2) {
			count += number / 2; //Ư�� ���丮���� ������ 2�� ���� �������� �˱� ���ؼ�
			number = number/ 2;
		}
		
		return count;
	}
}
