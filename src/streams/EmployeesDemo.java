package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeesDemo {
    public static void main(String[] args)
    {
        List<Employee> employeesList=new ArrayList<>();
        employeesList.add(new Employee("John","FINANCE",1000));
        employeesList.add(new Employee("Tim","ADMIN",5000));
        employeesList.add(new Employee("Ryan","ADMIN",2000));
        employeesList.add(new Employee("Tom","FINANCE",20000));


        //Top paid salary employees
        Map<String,Employee> topPaidEmployees=employeesList.stream().
                collect(Collectors.groupingBy(e->e.getDepartment(),
                        Collectors.collectingAndThen(Collectors.minBy
                                (Comparator.comparingDouble(e->e.getSalary())), Optional::get)));

        //Get the all employees dept count
        Map<String ,Long> eachDeptCount=employeesList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        //Group by dept
        Map<String ,List<Employee>> groupByDept=employeesList.stream().
                collect(Collectors.groupingBy(e->e.getDepartment()));

        System.out.println(topPaidEmployees);
        System.out.println(eachDeptCount);
        System.out.println(groupByDept);



    }
}
