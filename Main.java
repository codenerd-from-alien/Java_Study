import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int arr1[] = {11, 9, 7, 10};
        int[] answer = {};
        Arrays.sort(arr1);
        int cnt =0;
        for(int i =0; i < arr1.length;i++){
            if(arr1[i] % 2 ==0){
                cnt++;
            }
        }
        if(cnt ==0){
            answer[0] = -1;
        }
        int idx =0;
        for(int i =0; i < arr1.length;i++){
            if(arr1[i] % 2 ==0){
                answer[idx] = arr1[i];
                idx++;
            }
        }

    }


}