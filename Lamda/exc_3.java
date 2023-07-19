package Lamda;

import java.util.Arrays;
import java.util.List;

public class exc_3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Red","Green","Blue","PINK");


        System.out.println("-Lowercase strings-");
        stringList.replaceAll(str -> str.toLowerCase());
        stringList.forEach(System.out::println);

        System.out.println("-Uppercase strings-");
        stringList.replaceAll(str ->str.toUpperCase());
        stringList.forEach(System.out::println);
    }
}
