package OfficeHours.day21_04_26_2022.Encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 'M', 30, 160000);
        System.out.println(employee);

        //since it is private we need to access with Public Getter and Setter
        //employee.age=25;

        employee.setName("");
        System.out.println(employee.getName());

        //change age
        employee.setAge(15);
        System.out.println(employee.getAge());

        //change salary
        employee.setSalary(100000);
        System.out.println(employee.getSalary());

        //increase the salary of employee +20K
        employee.setSalary(employee.getSalary() + 20000);
        System.out.println(employee.getSalary());

        //decrease the salary of employee - 30K
        employee.setSalary(employee.getSalary() - 30000);
        System.out.println(employee.getSalary());
    }
}
