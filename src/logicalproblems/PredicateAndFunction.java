package logicalproblems;

import java.util.List;
import java.util.stream.Collectors;

public class PredicateAndFunction {
    public static void main(String[] args) {
        List<Employee> employees= List.of(
                new Employee(101,"Aadil",1, 3000L),
                new Employee(102,"Faisal",3, 50000L),
                new Employee(103,"Faizan",1, 4000L),
                new Employee(104,"Farhan",4, 3500L)
        );

        List<Employee> collect = employees.stream()
                .filter(emp -> emp.getSalary() > 40000L)
                .map(employee -> {
                    employee.setGrade(employee.getGrade()+1);//increase the grade
                    return employee;
                })
                .collect(Collectors.toList());
        for (Employee emp: collect){
            System.out.println(emp);
        }
    }
}

class Employee{
    private int id;
    private String name;
    private int grade;
    private Long salary;

    public Employee() {
    }

    public Employee(int id, String name, int grade, Long salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", salary=" + salary +
                '}';
    }
}
