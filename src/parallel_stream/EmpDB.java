package parallel_stream;

import map_reduce.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpDB {

    public static List<Emp> getOneThousandEmp(){
        List<Emp> empList = new ArrayList<>();
        for (int i=1; i<=1000;i++){
            empList.add(new Emp(i,"emp"+i, "A", new Random().nextInt(1000)));
        }
        return empList;
    }
}
