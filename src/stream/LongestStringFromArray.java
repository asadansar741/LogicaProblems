package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestStringFromArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("corejava","hibernate", "microservices");
        Optional<String> result = list.stream()
                .reduce( (a,b) -> a.length()>b.length()? a: b);
        System.out.println(result.get());
    }
}
