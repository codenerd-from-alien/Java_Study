package Java_Practice_pack;

import java.util.Scanner;
public class Java_paek_joon_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char s[] = new char[100];
		int alpha[] = new int[26];
		s = scn.next().toCharArray();/*자바로 입력을 받을 때 케릭터형 입력을 toCharArray 형식으로 받을 수 있다.*/
		
		for(int i =0; i < 26; i++) {
			alpha[i] = -1;
		}
		
		
		
		
		
		
		System.out.println(s);
		scn.close();
	}

}
