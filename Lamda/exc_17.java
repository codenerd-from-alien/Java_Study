package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class exc_17 {
    public static void main(String[] args) {
        //Write a Java program to implement
        // a lambda expression to check
        // if a list of strings contains a specific word.


        List<String> lst = Arrays.asList("Blue", "Red", "Orange","Yellow");

        boolean isExist = lst.stream().anyMatch("Blue"::equals);

        if(isExist){
            System.out.println("Exists");
        }

        System.out.println("-----------------sol--------------------");

        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        String searchColor = "Orange";

        Predicate<String> containsWord = word -> word.equals(searchColor);

        boolean flag = colors.stream().anyMatch(containsWord);
        System.out.println(searchColor + " exists?" + flag);

    }
}
