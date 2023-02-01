package algo_practice;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class java_paek_joon_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int cards = scn.nextInt();
		int Max_num = scn.nextInt();
		
		
		int before_reversed[] = new int[cards];
		for(int i =0; i < cards; i++) {
			int numbers = scn.nextInt();
			before_reversed[i] = numbers;
		}
		
		
		Integer[] rvs_arr = Arrays.stream(before_reversed).boxed().toArray(Integer[]::new);
		Arrays.sort(rvs_arr, Collections.reverseOrder());
		// 315 295 245 216 214 185 181 138 93 36
		List<Integer> Sum_values = new ArrayList<Integer>();
		for(int i =0; i < cards; i++) {
			for(int j = i +1; j< cards; j++) {
				for(int k = j+1; k < cards; k++) {
					int sum = rvs_arr[i] + rvs_arr[j] + rvs_arr[k] ;
					Sum_values.add(sum);
				}
			}
		}
		
		Collections.sort(Sum_values, Collections.reverseOrder());
		for(int i =0; i < Sum_values.size(); i++) {
			if(Sum_values.get(i) <=Max_num) {
				System.out.println(Sum_values.get(i));
				break;
			}
		}
		
		
		
		
		
		
		scn.close();
	}

}