package Chapter_3_part_2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Ahmad", "IT", 1201),
            new Employee(2, "Sami", "Sales", 950.8),
            new Employee(5, "Huda", "IT", 1010.5),
            new Employee(7, "Ali", "Marketing", 1300),
            new Employee(4, "Hani", "Sales", 1050)

        };

        List<Employee> listEmployees = Arrays.asList(employees);

        listEmployees.stream()
                .filter(e -> (e.getSalary() >= 800 && e.getSalary() < 1200))//filter out employees with a salary outside rage [800-1200)

                .map(e -> new Employee(e.getId(), e.getName(), e.getDepartment(), e.getSalary() * 1.02))//turn every employee object into new employee,

                //where the salary is multiplied by 1,02

                .collect(Collectors.
                        groupingBy(Employee::getDepartment,//collect all the employees, group them by their department, and return count of employee in each department

                                Collectors.counting()))
                .forEach((d, c) -> System.out.println("Dept: " + d + ", Count: " + c));//print the department and the count
    }

}
