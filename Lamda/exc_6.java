package Lamda;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class exc_6 {
    public static void main(String[] args) throws IOException {

        //Write a Java program to implement a lambda expression
        // to find the average of a list of doubles.

        List<Double> list = Arrays.asList(1.2, 1.5, 2.9, 3.12);

        double sum =list.stream().reduce(0.0, Double::sum);

        double avg = sum / list.size();
        System.out.println(avg);

        //문제 솔루션 정답
        System.out.println("---------------------------------------------------------");
        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        // Print the list elements
        System.out.println("Original values: " + nums);

        // Calculate the average of the list using lambda expression
        double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.0);


        // Print the average
        System.out.println("\nAverage of the original values: " + average);

    }
}
