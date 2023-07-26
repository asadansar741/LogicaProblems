package stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestNum {
    public static void main(String[] args) {
//        List<Integer> data = List.of(10,20,45,45,12,95,75,85,45,32);
//        int nthHighestNum= nThHighestNum(data,2);
//        System.out.println(nthHighestNum);

        Map<String,Integer> dataMap = new HashMap<>();
        dataMap.put("Aadil",1000);
        dataMap.put("Farooq",3000);
        dataMap.put("Akash",2000);
        dataMap.put("Hamdan",8000);
        dataMap.put("Pandav",5000);
        dataMap.put("Farhan",5000);
        dataMap.put("Faizan",7000);
        dataMap.put("Faisal",7000);

//        Map.Entry<String, Integer> nthHighestSalary = getNthHighestSalary(dataMap, 2);
//        System.out.println(nthHighestSalary);

        Map.Entry<Integer, List<String>> dynamicHighestSalary = getDynamicHighestSalary(dataMap, 2);
        System.out.println(dynamicHighestSalary);
    }

    public static int nThHighestNum(List<Integer> data,int num){
        return data.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList())
                .get(num-1);
    }

    public static Map.Entry<String,Integer> getNthHighestSalary(Map<String,Integer> data, int num){
        return data.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num-1);
    }
    public static Map.Entry<Integer,List<String>> getDynamicHighestSalary(Map<String,Integer> data, int num){
        return data.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,Collectors.toList()
                        )
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num-1);
    }
}
