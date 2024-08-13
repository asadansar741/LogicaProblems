package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SkipLimit {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 10).boxed()
                .skip(1)
                .limit(8)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
