package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(2,3,6,9,1,3,7).collect(Collectors.toList());
        //sum of all elements in the list
       int sum  =  numbers.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println("Sum: " + sum);

        //Evaluate the avg salary of all the emp who is having "A" grade
        List<Emp> allEmp = EmpDatabase.getAllEmp();
        double avg = allEmp.stream()
                .filter(emp -> emp.getGrade().equals("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println("Avg: " + avg);

        //Evaluate the sum of salary of all emp who is having 'A' grade
        double totalSum = allEmp.stream()
                .filter(emp -> emp.getGrade().equals("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Salary sum: " + totalSum);
    }
}
