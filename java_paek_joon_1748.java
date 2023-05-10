package Java_Practice_pack;
import java.util.*;
import java.io.*;
public class java_paek_joon_1748 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(bf.readLine());
		
		
		int count_index =0;
		
		for(int i =1; i <= number; i++) {
			int N = i / 10;
			if(N == 0) {
				count_index +=1;
			}else if(N>=1 && N<=9) {
				count_index +=2;
			}else if(N <=99) {
				count_index +=3;
			}else if(N <= 999) {
				count_index +=4;
			}else if(N <= 9999) {
				count_index +=5;
			}else if(N <= 99999) {
				count_index +=6;
			}else if(N <= 999999) {
				count_index +=7;
			}else if(N <= 9999999)  {
				count_index +=8;
			}else {
				count_index +=9;
			}
		
		}
		
		bw.write(String.valueOf(count_index));
		bw.flush();
		bw.close();
	}

}
