package Java_Practice_pack;
import java.util.Scanner;
import java.math.BigInteger;
public class Java_paek_joon_10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		BigInteger A = new BigInteger(scn.next());// �������� �� ������ �ִ��� ���� �� �ִ� ������ ũ��� ������ ����.
		BigInteger B = new BigInteger(scn.next()); //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		//BigInteger Ŭ������ �̿��ؼ� ���� ������ �ʰ� �Ǵ� ���� �����ش�. ���ڿ��� ���� ���� �Ѱ���� �Ѵ�.
		A= A.add(B);
		System.out.println(A.toString());
		
		
		
		
		scn.close();
	}

}
