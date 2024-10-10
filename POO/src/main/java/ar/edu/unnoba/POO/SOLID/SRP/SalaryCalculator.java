package ar.edu.unnoba.POO.SOLID.SRP;

public class SalaryCalculator {
    public double calculateAnnualSalary(Employee employee){
        return employee.getSalary()*12;
    }
}
