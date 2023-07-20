package Lamda;

import java.util.function.Predicate;

public class exc_18 {
    public static void main(String[] args) {

        //Write a Java program to implement a lambda expression to check
        // if a given number is a perfect square.
        Predicate<Integer> isPerfectSquare = n ->{
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt ==n;
        };


        int N = 36;
        boolean rst = isPerfectSquare.test(N);
        System.out.println(rst);

    }
}
