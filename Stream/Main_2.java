package Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class Main_2 {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        //스트림과 람다를 사용을 하는 이유에 대해서 알아 볼 것임
        /*영어로는 Imperative approach로 포문을 통해서 여자만 배열에 넣을 경우에*/

        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        //성별이 female만 출력
        females.forEach(System.out::println);
        /******************************************************************/
        System.out.println("*****************************************************************");

        //함수형 프로그래밍의 시작으로 자바에서 코드를 깔끔하고 간결하게 사용이 가능하다.
        //Declartive approach

        //위에서 포문으로 성별이 여자인 사람만 배열에 넣었는데 람다식으로 간단하게 출력깅 가능

        //필터 사용 예제
        List<Person> result_of_filter = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        result_of_filter.forEach(System.out::println);
        /******************************************************************/
        System.out.println("*****************************************************************");



        //Sort 사용 예제제
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
        /******************************************************************/
        System.out.println("*****************************************************************");


        //ALL MATCH 예제

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);
        System.out.println(allMatch); // 하나 라도 8 이상이 아니면 false
        /******************************************************************/
        System.out.println("*****************************************************************");
        //Any match

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() >121);
        System.out.println(anyMatch);//121을 넘는 나이는 없어서 false 리턴

        /******************************************************************/
        System.out.println("*****************************************************************");

        //None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));

        System.out.println(noneMatch);//모든 요소를 만족을 해야지 true 반환
        /******************************************************************/
        System.out.println("*****************************************************************");

        //Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);//ifPresent 존재하면 출력


        /******************************************************************/
        System.out.println("*****************************************************************");

        people.stream()
                .min(Comparator.comparing(Person::getAge))
        .ifPresent(System.out::println);//나이가 최소인 사람 출력

        /******************************************************************/
        System.out.println("*****************************************************************");


        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

            groupByGender.forEach((gender, people1) -> {
              System.out.println(gender);
              people1.forEach(System.out::println);
              System.out.println();
            });

        /******************************************************************/
        System.out.println("*****************************************************************");

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(System.out::println);



    }
    private static List<Person> getPeople(){
        return List.of(
                new Person("Antonio",20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White",57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
