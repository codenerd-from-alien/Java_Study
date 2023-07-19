package Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exc_7 {
    public static void main(String[] args) {
        //Write a Java program to implement a lambda expression
        // to remove duplicates from a list of integers.
        List<Integer> list = Arrays.asList(1,1,2,3,4,4,5,6,7);

        list.stream().distinct().forEach(System.out::println);
        /*********************************************************/
        System.out.println("-solution------------------------------");



        // Create a list of integers with duplicates
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        // Print the list
        System.out.println("List elements " + nums);
        // Remove duplicates using lambda expression
        List<Integer> unique_nums = new ArrayList<>();
        nums.stream()
                .distinct()
                .forEach(unique_nums::add);

        // Print the list without duplicates
        System.out.println("\nList elements without duplicates: " + unique_nums);
    }
}
