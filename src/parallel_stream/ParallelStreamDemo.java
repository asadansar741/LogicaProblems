package parallel_stream;

import map_reduce.Emp;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

/*        start = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("plain stream took time : " + (end-start));

        System.out.println("======================");

        start = System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took time : " + (end-start));*/

        /*IntStream.range(1,10)
                .forEach(x -> System.out.println("Thread: " + Thread.currentThread().getName() +":"+ x));
        IntStream.range(1,10).parallel()
                .forEach(x -> System.out.println("Thread: " + Thread.currentThread().getName() +":"+ x));
*/

        List<Emp> employees = EmpDB.getOneThousandEmp();
        //normal execution
        start = System.currentTimeMillis();
        double avgSal = employees.stream().map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Avg sal: " + avgSal + " Time taken: " + (end-start));
        //parallel execution
        start = System.currentTimeMillis();
        double avgSalParallel = employees.stream().parallel().map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Avg sal parallel: " + avgSalParallel + " Time taken: " + (end-start));


    }
}


