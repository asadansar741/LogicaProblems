package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,3,12,4);
        //print the list in ASC order
//        Collections.sort(list);// ASC
//        System.out.println(list);

        //print the list in Ascending order
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        //print the list in Descending order
        List<Integer> sortedListReverse = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListReverse);

    }
}
