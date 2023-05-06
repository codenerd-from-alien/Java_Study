package Java_Practice_pack;
import java.util.*;
import java.io.*;
public class java_paek_joon_11053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		int arr[] = new int[number + 1];
		int dynamic_arr[] = new int[number +1];
		
		arr[0] = 0;
		dynamic_arr[0] = 0;
		for(int i=1; i <= number ;i++) {
			dynamic_arr[i] = 1;
		}
		
		
		Scanner scn = new Scanner(System.in);
		
		for(int i =1; i <= number;i++) {
			
			int num = scn.nextInt();
			arr[i] = num;
		}
		
		for(int i =2; i <= number; i++) {
			for(int j =1; j < i; j++) {
				
				if(    (arr[i] > arr[j])   ) {
					
					dynamic_arr[i] = Math.max(dynamic_arr[j] +1, dynamic_arr[i] );
					
				}
				
			}
		}
		
	
		Arrays.sort(dynamic_arr);
		
		
		System.out.print(dynamic_arr[number]);
		
	}

}
