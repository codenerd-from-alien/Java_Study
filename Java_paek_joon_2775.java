package Java_Practice_pack;
import java.util.Scanner;

public class Java_paek_joon_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int number = scn.nextInt();	
		
		int arr[][] = new int[number + 1][14];
		
		
		for(int i =0; i < 14; i++) {
			arr[0][i] = i+1;
		}
		
		for(int i = 0; i <= number ;i++) {
			for(int j = 0; j < 14; j++) {
				if(i >=1 && j==0) {
					arr[i][j] = 1;
				}else if(i >=1 && j >=1) {
					for(int k = 0; k <= j; k++) {
						arr[i][j] += arr[i-1][k];
					}
				}
			}
		}
		
		
		
		int arr_floor[] = new int[number];
		int arr_hosu[] = new int[number];
		for(int i =0; i < number; i++) {
			int floor = scn.nextInt();
			int hosu = scn.nextInt();
			arr_floor[i] += floor;
			arr_hosu[i] += hosu;
		}
		
		
		for(int i =0; i < number;i++) {
			System.out.printf("%d\n", arr[arr_floor[i]][arr_hosu[i] -1]);
			
		}
		
		
		
		
		
	
	
		
		scn.close();
		
		
	}

}
