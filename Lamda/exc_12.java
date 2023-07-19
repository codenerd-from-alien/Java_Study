package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class exc_12 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5);

        Integer sum = lst.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Integer mul = lst.stream().reduce(1, (x,y) -> x *y);
        System.out.println(mul);
    }
}
