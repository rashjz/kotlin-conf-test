package app.test.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rashad on 8/12/2018.
 */
public class StreamTask2 {


    public static void main(String[] args) {
        Department account = new Department("Account", 75);
        Department hr = new Department("HR", 50);
        Department ops = new Department("OP", 25);
        Department tech = new Department("Tech", 150);

        List<Employee> employeeList = Arrays.asList(new Employee("David", 32, "Matara", account),
                new Employee("Brayan", 25, "Galle", hr),
                new Employee("JoAnne", 45, "Negombo", ops),
                new Employee("Jake", 65, "Galle", hr),
                new Employee("Brent", 55, "Matara", hr),
                new Employee("Allice", 23, "Matara", ops),
                new Employee("Austin", 30, "Negombo", tech),
                new Employee("Gerry", 29, "Matara", tech),
                new Employee("Scote", 20, "Negombo", ops),
                new Employee("Branden", 32, "Matara", account),
                new Employee("Iflias", 31, "Galle", hr));

        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .reduce(Integer::max)
                .ifPresent(System.out::print);

        System.out.println("Find the total number of employees in all the departments.");
        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .distinct().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("Find the department which has the highest number of employees");
        employeeList.stream()
                .map(Employee::getDepartment)
                .reduce( (d1, d2) -> d1.getNoOfEmployees() > d2.getNoOfEmployees() ? d1 : d2)
                .ifPresent(d -> System.out.println(d.getDepartmentName()));
    }

}
