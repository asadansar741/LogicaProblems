package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDatabase {

    public static List<Emp> getAllEmp(){
        return Stream.of(
                new Emp(1001,"Faisal", "A", 6000),
                new Emp(1002,"Faizan", "A", 5000),
                new Emp(1003,"Farhan", "A", 3000),
                new Emp(1004,"Akhlad", "A", 7000),
                new Emp(1005,"Ajju", "A", 8000)
        ).collect(Collectors.toList());
    }
}
