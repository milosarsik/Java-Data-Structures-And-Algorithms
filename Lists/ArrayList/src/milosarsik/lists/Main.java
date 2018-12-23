package milosarsik.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("John", "Doe", 4563));
        employeeList.add(new Employee("Mike", "Smith", 4563));
        employeeList.add(new Employee("Bill", "Hill", 4563));
        employeeList.add(new Employee("Tim", "Jones", 4563));

        System.out.println(employeeList.get(1));        // Since it is backed by an array, array list is zero based
                                                        // to access the second element, we use 1

        employeeList.set(2, new Employee("Jane", "Jones", 5000));           // Replacing the 3rd position

        employeeList.add(3, new Employee("Terrance","Howard",4123));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);         // This is to get the backing array

//        for(Employee employee: employeeArray)
//        {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee("Mike", "Smith", 4563)));     // Check if it contains the object

        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4563)));        // Get the index

        employeeList.remove(0);                                                                            // Removing the object at the specified index

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
