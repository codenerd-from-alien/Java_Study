package Lamda;

import java.util.Arrays;
import java.util.Comparator;
public class exc_19 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};

        Integer largest_scd= Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);


        System.out.println(largest_scd);


        Integer second_smallest = Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(second_smallest);


    }
}
