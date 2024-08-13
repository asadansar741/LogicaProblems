package sort;

import lambda_expression.Book;
import java.util.*;
import java.util.stream.Collectors;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);
        List<Map.Entry<String,Integer>>  entries = new ArrayList<>(map.entrySet());

        //Traditional approach
       /* Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        entries.forEach(newMap -> System.out.println(newMap.getKey() + " " + newMap.getValue()));*/

        //With lambda
/*        Collections.sort(entries,( o1,  o2) -> o1.getKey().compareTo(o2.getKey()));
        entries.forEach(newMap -> System.out.println(newMap.getKey() + " " + newMap.getValue()));*/
        //With lambda and with value
        /*Collections.sort(entries,( o1,  o2) -> o1.getValue().compareTo(o2.getValue()));
        entries.forEach(newMap -> System.out.println(newMap.getKey() + " " + newMap.getValue()));*/

        //sort with stream
/*        List<Map.Entry<String, Integer>> collect = map.entrySet().stream().sorted((obj1, obj2) -> obj1.getKey().compareTo(obj2.getKey())).collect(Collectors.toList());
        System.out.println(collect);*/
        //sort with stream and Function
/*        List<Map.Entry<String, Integer>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        System.out.println(collect);*/

        //sort in desc with stream and Function
/*        List<Map.Entry<String, Integer>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(collect);*/


        //sort map of book with name
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("a", new Book(1,"Faisal",5));
        bookMap.put("g", new Book(1,"Faizan",4));
        bookMap.put("t", new Book(1,"Farhan",6));
        bookMap.put("l", new Book(1,"Akhlad",7));

/*        List<Map.Entry<String, Book>> sortedBook = bookMap.entrySet()
                .stream().sorted(((o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName())))
                .collect(Collectors.toList());
        System.out.println(sortedBook);*/

        //using Function
        List<Map.Entry<String, Book>> sortedBook = bookMap.entrySet()
                .stream().sorted((Map.Entry.comparingByValue(Comparator.comparing(Book::getName))))
                .collect(Collectors.toList());
        System.out.println(sortedBook);

        //using Function reverse
/*        List<Map.Entry<String, Book>> sortedBook = bookMap.entrySet()
                .stream().sorted((Map.Entry.comparingByValue(Comparator.comparing(Book::getName, Comparator.reverseOrder()))))
                .collect(Collectors.toList());
        System.out.println(sortedBook);*/

/*        Map<String, Book> sortedBookMap = bookMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::getName)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // merge function in case of key conflicts
                        LinkedHashMap::new // maintains the order
                     System.out.println(sortedBookMap);
                ));*/





    }
}
