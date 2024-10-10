package ar.edu.unnoba.POO.SOLID.SRP;

public class EmployeePrinter {
    public void printEmployee(Employee employee){
        System.out.println("Employee : "+ employee.getName()+"Salary: "+ employee.getSalary());
    }
}
