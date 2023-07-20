package Lamda;

import java.util.Arrays;
import java.util.List;

public class exc_15 {
    public static void main(String[] args) {

        // Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum_even = list.stream().filter(i -> i %2==0).reduce(0,Integer::sum);

        System.out.println(sum_even);

        int sum_odd = list.stream().filter(i -> i %2 !=0).reduce(0,Integer::sum);
        System.out.println(sum_odd);

        //문제 해석 잘못함 모든 홀수 및 짝수의 제곱합을 계산하는 람다 식을 구해야함
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum_squares_odd = nums.stream()
                .filter(n ->n %2!=0)
                .mapToInt(n -> n*n)
                .sum();

        int sum_squares_even = nums.stream()
                .filter(n -> n %2==0)
                .mapToInt(n -> n*n)
                .sum();

        System.out.println("odd squares " + sum_squares_odd);
        System.out.println("even squares " + sum_squares_even);



    }
}
