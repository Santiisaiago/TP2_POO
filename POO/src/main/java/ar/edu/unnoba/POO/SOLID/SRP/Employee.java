package ar.edu.unnoba.POO.SOLID.SRP;

// En esta clase vamos cumplir con el principio de responsabilidad unica
// Este principio quiere decir que una clase debe tener una unica responsabilidad o proposito dentro del sistema.
// El cambio en una responsabilidad provocara la modificacion en otra responsabilidad.

/* Este es un ejemplo en donde no se aplica este principio.
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // CALCULAR SALARIO

    public double calculateAnnualSalaray() {
        return this.salary*12;
    }
    // MOSTRAR EMPLEADO

    public void printEmployee(){
        System.out.println("Employee"+this.name+ "Salario"+this.salary);
    }
}
*/

// Ahora el mismo caso, pero aplicando el principio SRP
// Clase que solo se encarga de los datos del empleado
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
