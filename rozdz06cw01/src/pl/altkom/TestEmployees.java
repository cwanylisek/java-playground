package pl.altkom;

import pl.altkom.employees.Employee;
import pl.altkom.employees.Manager;

// klasa testowa
public class TestEmployees {

    // metoda główna
    public static void main(String[] args) {
        Employee emp = new Manager("Adam");
        System.out.println(emp.getInfo());
        System.out.println(emp.getEmployeeInfo());
    }
}
