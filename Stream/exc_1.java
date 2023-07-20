package Stream;

import java.util.Arrays;
import java.util.List;

public class exc_1 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);

        Integer avg = (int) lst.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        System.out.println(avg);

        double average = lst.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(average);

    }
}
