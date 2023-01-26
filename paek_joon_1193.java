package algo_practice;

import java.util.Scanner;
public class paek_joon_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int ntt = 1;
		while(true) {
			if((ntt-1)*(ntt) /2 < number && number<= (ntt) *(ntt +1) /2) {
				break;
			}
			ntt+=1;
		}
		
		if(ntt % 2!=0) {
			int a = ntt*(ntt +1) /2;
			System.out.printf("%d", a - number +1);
			System.out.println("/");
			System.out.printf("%d", ntt -(a - number) );
			}
		else {
			int a = ntt * (ntt + 1) / 2;
			System.out.printf("%d", ntt-(a - number));
			System.out.printf("/");
			System.out.printf("%d", a- number +1);
		}
		
		
		
		
		scn.close();
	}

}
