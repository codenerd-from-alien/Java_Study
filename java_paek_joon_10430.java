package Java_Practice_pack;
import java.io.*;
import java.util.*;
public class java_paek_joon_10430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		
		System.out.printf("%d\n", (A+B)%C );
		System.out.printf("%d\n", ((A%C) + (B%C))%C);
		System.out.printf("%d\n", (A*B)%C );
		System.out.printf("%d\n", (A*B)%C );
		
	}

}
