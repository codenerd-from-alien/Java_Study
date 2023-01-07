package Java_Practice_pack;
import java.util.Scanner;


public class Java_paek_joon_5622 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int count =0;
		for(int i =0; i < str.length(); i++) {
			
			
			if((str.charAt(i) == 'A' ) || (str.charAt(i) == 'B') || (str.charAt(i) == 'C')) {
				count += 3;
			}else if((str.charAt(i) == 'D' ) || (str.charAt(i) == 'E') || (str.charAt(i) == 'F')) {
				count += 4;
			}else if((str.charAt(i) == 'G' ) || (str.charAt(i) == 'H') || (str.charAt(i) == 'I')) {
				count += 5;
			}else if((str.charAt(i) == 'J' ) || (str.charAt(i) == 'K') || (str.charAt(i) == 'L')) {
				count += 6;
			}else if((str.charAt(i) == 'M' ) || (str.charAt(i) == 'N') || (str.charAt(i) == 'O')) {
				count += 7;
			}else if((str.charAt(i) == 'P' ) || (str.charAt(i) == 'Q') || (str.charAt(i) == 'R') || (str.charAt(i) == 'S')) {
				count += 8;
			}else if((str.charAt(i) == 'T' ) || (str.charAt(i) == 'U') || (str.charAt(i) == 'V')) {
				count += 9;
			}else if((str.charAt(i) == 'X' ) || (str.charAt(i) == 'Y') || (str.charAt(i) == 'W') || (str.charAt(i) == 'Z')) {
				count +=10;
			}else if(str == "OPERATOR") {
				count +=11;
			}else {
				count +=2;
			}
			
			
		}
		System.out.println(count);
		
		
		
		
		
		
		scn.close();
		

	}

}
