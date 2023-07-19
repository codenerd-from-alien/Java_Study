package Lamda;


import java.util.function.Predicate;

interface check_empty{
    boolean stringChecker(String str);
}
public class exc_2 {
    public static void main(String[] args) {
        check_empty check_empty = (param) ->{
          if(param.length() > 0){
              return true;
          }else{
              return false;
          }
        };


        System.out.println(check_empty.stringChecker("check"));
        System.out.println(check_empty.stringChecker(""));

        /*****************************************************************/
        Predicate<String> isEmptyString = str -> str.isEmpty();

        // Test cases
        String str1 = ""; // empty string
        String str2 = "Java lambda expression!"; // non-empty string

        // Check if the strings are empty using the lambda expression
        System.out.println("String 1:" + "''");
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));

    }
}
