import java.util.*;
public class java_paek_joon_10250 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        //6 12 10

        for(int i=0; i<T; i++){
            int H = input.nextInt();
            int W = input.nextInt();
            int N = input.nextInt();

            if(N % H ==0){
                System.out.println((H*100) + (N/H));
            }
            else {
                System.out.println(((N % H) * 100) + ((N / H) + 1)); // h=6 n=10
            }

        }




    }

}
