import java.util.*;
public class java_paek_joon_1110 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int temp = N;


        //6 12 10

        int cnt=0;

        while(true){
            int ten = N/10; //2, 6
            int one = N % 10; //6, 8

            int sum=0;

            sum = ten+one; //8 , 14

            if(one*10 +sum%10 == temp){
                cnt++;
                System.out.println(cnt);
                break;
            }
            else{
                cnt++;
                N=one*10 +sum%10;
            }
        }
    }

}
