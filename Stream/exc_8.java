package Stream;

import java.util.Arrays;
import java.util.List;

public class exc_8 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,4,5,6,7,7,10);

        int secondSmallest = lst.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println(secondSmallest);

        int secondLargest = lst.stream()
                .sorted((a,b) -> b -a)
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(secondLargest);

        List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("List of numbers: " + nums);
        // Find the second smallest element
        Integer scdSmallest = nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        // Find the second largest element
        Integer scdLargest = nums.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("\nSecond smallest element: " + scdSmallest);
        System.out.println("\nSecond largest element: " + scdLargest);
    }
}
