package Lamda;

import java.util.Scanner;
import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;


public class exc_8 {
    public static void main(String[] args) {
        //Write a lambda expression to implement a lambda expression
        // to calculate the factorial of a given number.

        int number;
        Scanner scn = new Scanner(System.in);
        number = scn.nextInt();

        long result_fst = LongStream.rangeClosed(1, number).reduce(1,(long num1, long num2) -> num1*num2);
        System.out.println(result_fst);


        System.out.println("------------------------------sol------------------------------------");

        // Define the factorial lambda expression
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        // Calculate the factorial of a number using the lambda expression
        long n = 7;
        long factorial_result = factorial.applyAsLong(n);

        // Print the factorial result
        System.out.println("Factorial of " + n + " is: " + factorial_result);
        
    }
}
