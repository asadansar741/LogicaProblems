package map_flatmap;

import java.util.Arrays;
import java.util.List;

public class EkartDataBase {

    public static List<Customer> getAll(){
       return Arrays.asList(
               new Customer(101, "Farhan" ,"farhan@gmail.com", Arrays.asList("53535","3535353")),
               new Customer(102, "Faisal" ,"faisal@gmail.com", Arrays.asList("533535353","42523554242")),
               new Customer(103, "Akhlad" ,"akhlad@gmail.com", Arrays.asList("453453453453","453453453")),
               new Customer(104, "Ajju" ,"ajju@gmail.com", Arrays.asList("1254785847","8574859658"))
       );
    }
}
