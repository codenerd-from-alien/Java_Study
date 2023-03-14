package datastructurefile;
import java.util.*;
import java.io.*;
public class java_paek_joon_10872 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int result =1;
		for(int i =1; i <= num ;i++) {
			result = result * i;
		}
		
		if(num == 0) {
			System.out.print(1);
		}else {
			System.out.print(result);
		}
		
		
		
		
		
	}

}
