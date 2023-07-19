package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exc_4 {
    public static void main(String[] args) {
        //Problem write Java program to implement a lambda
        //expression to filter out even and odd numbers from a list of integers

        List<Integer> int_lst = Arrays.asList(1, 2, 3, 4, 5, 6);


        int_lst.stream().filter(num -> num % 2==0).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("----------------------------");
        int_lst.stream().filter(num -> num % 2 !=0).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
