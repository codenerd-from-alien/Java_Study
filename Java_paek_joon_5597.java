package Java_Practice_pack;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Java_paek_joon_5597 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> init_number = new ArrayList<Integer>(Arrays.asList(
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 ,17, 18, 19
				, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 ,30
				));/*�л��� ��ȣ ����Ʈ������ �ʱ�ȭ*/
		
		
		/*������ �л��� ����Ʈ�� add ���༭ �ʱ�ȭ*/
		for(int i =0; i < 28; i++) {
			int input_val = scn.nextInt();
			list.add(input_val);
		}
		scn.close();
		//���� ���� ���� �л����� �ʱ�ȭ �� ���� �־���
		List<Integer> St_didnt_submit = new ArrayList<>(init_number);
		St_didnt_submit.removeAll(list);//�ʱ�ȭ�� ��ü ���ڿ��� �Էµ� ����Ʈ�� ���� ���� ��ü�� ����
		
		//���
		for(int i =0; i < St_didnt_submit.size();i++) {
			System.out.println(St_didnt_submit.get(i));
		}
		
		
		
		
		
		
	}
	
	

}
