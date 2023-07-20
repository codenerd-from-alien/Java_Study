package Stream;

import java.util.Arrays;
import java.util.List;

public class exc_3 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(
                1,2,3,4,5,6
        );

        int sum_of_even =lst.stream().filter(num ->num %2==0)
                .reduce(0,Integer::sum);

        System.out.println(sum_of_even);



        int sum_of_odd = lst.stream()
                .filter(num -> num %2 !=0)
                .reduce(0,Integer::sum);

        System.out.println(sum_of_odd);


        int sumOfEvens = lst.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfEvens);

        // Sum of odd numbers
        int sumOfOdds = lst.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd numbers: " + sumOfOdds);
    }
}
