package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfChar {
    public static void main(String[] args) {

        //count occurrence of character in String
        String input = "ilovejavatechie";
        String[] inputArr = input.split("");
        Map<String,Long> occurrence = Arrays.stream(inputArr).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        ));
        System.out.println(occurrence);

        //find the duplicate character in String
        List<String> duplicate = Arrays.stream(inputArr).collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(s -> s.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicate);

        //find the unique elements in String array
        List<String> unique = Arrays.stream(inputArr)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter( e -> e.getValue() ==1)
                .map(s -> s.getKey())
                .collect(Collectors.toList());
        System.out.println(unique);


        //find the first non-repeated char
        String firstUnique = Arrays.stream(inputArr)
                .collect(Collectors.groupingBy(
                        Function.identity(),LinkedHashMap::new, Collectors.counting()//remember linkedHashmap
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() ==1)
                .map(s -> s.getKey())
                .findFirst().get();
        System.out.println(firstUnique);
    }
}
