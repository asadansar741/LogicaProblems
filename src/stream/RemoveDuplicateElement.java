package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001,"Farhan","Kmg"));
        list.add(new Employee(1002,"Faisal","Kmg"));
        list.add(new Employee(1001,"Farhan","Kmg"));

        //Manual approach
        for (int i = 0; i < list.size(); i++) {
            Employee currentEmployee = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (currentEmployee.getName().equals(list.get(j).getName())) {
                    list.remove(j);
                    j--; // Adjust the index after removal
                }
            }
        }

        list.forEach(System.out::println);


        // with java 8
        List<String> names = new ArrayList<>();
        List<Employee> uniqueEmployees = list.stream()
                .filter(e -> {
                    if (!names.contains(e.getName())) {
                        names.add(e.getName());
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
        uniqueEmployees.forEach(System.out::println);

    }
}

class Employee{
    private int id;
    private String name;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
