package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class exc_6 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("a" ,"b", "c","z","r");

       lst.stream()
               .sorted()
               .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        lst.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).forEach(System.out::println);


        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original List of strings(colors): " + colors);
        // Sort strings in ascending order
        List < String > ascendingOrder = colors.stream()
                .sorted()
                .collect(Collectors.toList());

        // Sort strings in descending order
        List < String > descendingOrder = colors.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("\nSorted in Ascending Order: " + ascendingOrder);
        System.out.println("\nSorted in Descending Order: " + descendingOrder);

    }

}
