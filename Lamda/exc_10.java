package Lamda;

import java.util.function.BiFunction;

public class exc_10 {
    public static void main(String[] args) {
        //Write a Java program to implement
        // a lambda expression to concatenate two strings.

        String string_fst = "str1";
        String string_scd = "str2";


        BiFunction<String, String, String> concat2
                =(s1, s2) -> s1 + s2;

        String rst = concat2.apply(string_fst, string_scd);
        System.out.println(rst);



        /*----------------------------------------------------------*/
        System.out.println("----------------------sol--------------------------");

        // Define the concatenate lambda expression
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

        // Concatenate two strings using the lambda expression
        String string1 = "Good ";
        String string2 = "Morning!";
        System.out.println("Original strings: " + string1 + ", " +string2);
        String result = concatenate.apply(string1, string2);

        // Print the concatenated string
        System.out.println("\nConcatenated string: " + result);

    }


}
