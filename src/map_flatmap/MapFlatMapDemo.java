package map_flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();

        //get All email ids
        List<String> emails = customers.stream().map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        //get all the mobile numbers for all the customers
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
