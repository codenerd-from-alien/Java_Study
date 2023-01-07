package Java_Practice_pack;
import java.util.Scanner;
import java.util.ArrayList;

public class Java_paek_joon_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		int number = scn.nextInt();
		for(int i =0; i < number; i++) {
			
			int num_of_st = scn.nextInt();
			int arr[] = new int[num_of_st];
			
			for(int j = 0; j < num_of_st; j ++) {
				int score = scn.nextInt();
				arr[j] += score;
			}
			double sum = 0;
			
			for(int j =0; j < num_of_st ;j++) {
				sum += arr[j];
			}
			double avg = sum / num_of_st;
			int count =0;
			for(int j = 0; j < num_of_st; j++) {
				if(arr[j] > avg ) {
					count+=1;
				}
				
			}
			double result = (count / (double) num_of_st) * 100;
			list.add(result);
			sum =0; count =0; 
			arr = new int[0];
		}
		
		for(Double i : list) {
			System.out.println(String.format("%.3f", i) + "%");
		}
		
		
		
		
		
		scn.close();

	}

}
