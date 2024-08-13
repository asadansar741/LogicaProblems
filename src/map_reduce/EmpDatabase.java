package map_reduce;

import java.util.Arrays;
import java.util.List;

public class EmpDatabase {
    public static List<Emp> getAllEmp(){
        return Arrays.asList(
                new Emp(1001,"Faisal", "A", 9000),
                new Emp(1002,"Farhan", "B", 6000),
                new Emp(1003,"Faizan", "A", 8000),
                new Emp(1004,"Akhlad", "C", 5000),
                new Emp(1005,"Ajju", "D", 4000)
        );
    }
}
