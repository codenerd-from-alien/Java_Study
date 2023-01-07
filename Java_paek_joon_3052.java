package Java_Practice_pack;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Java_paek_joon_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();//등록된 나머지 리스트
		for(int i =0; i <10; i++) {
			
			int number = scn.nextInt();
			
			list.add(number % 42);	
		}
		scn.close();
		Set<Integer> set = new HashSet<Integer>(list);
		List<Integer> Renewed = new ArrayList<Integer>(set);
		
		System.out.println(Renewed.size());
		
		
		
		
		
		
		
		
	}

}
