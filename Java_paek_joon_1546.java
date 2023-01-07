package Java_Practice_pack;
import java.util.Scanner;
public class Java_paek_joon_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int input_number = scn.nextInt();
		double arr[] = new double[input_number];
		
		double Max_val = 0;
		for(int i =0; i < input_number; i++) {
			int number = scn.nextInt();
			if (number > Max_val) {
				Max_val = number;
			}
			arr[i] += number;
			
		}
		double sum =0;
		for(int i =0; i< arr.length; i++) {
			sum = sum + ((arr[i] / Max_val) *100);
		}
		
		System.out.println(sum / arr.length);
		
		scn.close();
	}

}
