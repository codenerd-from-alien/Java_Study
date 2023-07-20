package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exc_4 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(
                1,2,3,3,3,4,4,5
        );

        lst.stream().distinct().forEach(System.out::println);


        List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original List of numbers: " + nums);
        // Remove duplicates
        List < Integer > distinctNumbers = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("After removing duplicates from the said list: " + distinctNumbers);
    }
}
