package Java_Practice_pack;
import java.util.Scanner;
import java.math.BigInteger;
public class Java_paek_joon_10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		BigInteger A = new BigInteger(scn.next());// 문제에서 롱 형에서 최대한 받을 수 있는 숫자의 크기는 다음과 같다.
		BigInteger B = new BigInteger(scn.next()); //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		//BigInteger 클래스를 이용해서 숫자 범위가 초과 되는 것을 더해준다. 문자열로 인자 값을 넘겨줘야 한다.
		A= A.add(B);
		System.out.println(A.toString());
		
		
		
		
		scn.close();
	}

}
