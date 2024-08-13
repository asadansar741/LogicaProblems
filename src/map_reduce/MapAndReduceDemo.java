package map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(2,3,6,9,1,3,7).collect(Collectors.toList());
        //sum of all elements in the list
        int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("Sum: " + sum);


        //Multiplication of all elements in the list
        int mul = numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println("Mul: " + mul);

        //Max of all elements in the list
        int max = numbers.stream().reduce(0,(a,b) -> a>b?a:b);
        System.out.println("Max: " + max);

        //find the Longest String from list
        List<String> list = Arrays.asList("corejava","hibernate","microservices");
        Optional<String> maxString = list.stream().reduce( (a, b) -> a.length()>b.length()? a:b);
        System.out.println("max String : " + maxString.get());

        //get all emp's avg salary whose grade is "A"
        List<Emp> allEmp = EmpDatabase.getAllEmp();
        double avgSalary = allEmp.stream()
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println("Avg Salary: " + avgSalary);

        //get all emp's sum of  salary whose grade is "A"
        double totalSum = allEmp.stream()
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Total Sum: " + totalSum);
    }
}
