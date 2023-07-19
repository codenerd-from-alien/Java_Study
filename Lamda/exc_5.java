package Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class exc_5 {
    public static void main(String[] args) {
        //Problem 5
        //Write a Java program to implement a lambda expression
        // to sort a list of strings in alphabetical order.
        List<String> lst = Arrays.asList("b", "c", "e", "a", "d");


        lst.sort((str1, str2)->str1.compareToIgnoreCase(str2));
        lst.forEach(System.out::println);
    }
}
