package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exc_2 {
    public static void main(String[] args) {

        List<String> lst = Arrays.asList("db","os","DataStrucTure");
        lst.replaceAll(str -> str.toLowerCase());
        lst.forEach(System.out::println);


        lst.replaceAll(str -> str.toUpperCase());
        lst.forEach(System.out::println);


        System.out.println("-----sol---------------------");

        List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        List<String> uppercaseStrings = colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);

        System.out.println("----------------------------------");

        List<String> lowercaseStrings = colors.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowercaseStrings);

    }
}
