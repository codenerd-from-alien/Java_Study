import java.io.*;

public class paek_joon_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int cnt =0;

        while (true){

            if(num % 5 ==0){
                cnt += num /5;
                break;
            }else if(num < 0){
                cnt = -1;
                break;
            }
            num -= 3;
            cnt+=1;
        }


        System.out.println(cnt);;



    }
}
