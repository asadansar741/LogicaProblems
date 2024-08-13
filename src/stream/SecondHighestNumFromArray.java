package stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumFromArray {
    public static void main(String[] args) {
        int numbers[] = {5,9,11,2,8,21,1};
        int secondHighestNum = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println("2nd highest num: " + secondHighestNum);
    }
}
