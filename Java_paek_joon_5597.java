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
				));/*학생의 번호 리스트형으로 초기화*/
		
		
		/*제출한 학생의 리스트에 add 해줘서 초기화*/
		for(int i =0; i < 28; i++) {
			int input_val = scn.nextInt();
			list.add(input_val);
		}
		scn.close();
		//제출 하지 않은 학생들을 초기화 된 값을 넣어줌
		List<Integer> St_didnt_submit = new ArrayList<>(init_number);
		St_didnt_submit.removeAll(list);//초기화된 전체 숫자에서 입력된 리스트를 빼준 값을 객체에 저장
		
		//출력
		for(int i =0; i < St_didnt_submit.size();i++) {
			System.out.println(St_didnt_submit.get(i));
		}
		
		
		
		
		
		
	}
	
	

}
