package ar.edu.unnoba.POO;

import ar.edu.unnoba.POO.SOLID.OCP.Circle;
import ar.edu.unnoba.POO.SOLID.OCP.Rectangle;
import ar.edu.unnoba.POO.SOLID.OCP.Shape;
import ar.edu.unnoba.POO.SOLID.OCP.Triangle;
import ar.edu.unnoba.POO.SOLID.SRP.Employee;
import ar.edu.unnoba.POO.SOLID.SRP.EmployeePrinter;
import ar.edu.unnoba.POO.SOLID.SRP.SalaryCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {

		// Probamos el principio de SRP.
		Employee employee = new Employee("John", 5000.0);
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		EmployeePrinter printer = new EmployeePrinter();
		double annualSalary = salaryCalculator.calculateAnnualSalary(employee);
		System.out.println("Annual Salary: " + annualSalary);
		printer.printEmployee(employee);

		// Probamos el principio de OCP}
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 6);
		Shape triangle = new Triangle(3, 4);

		System.out.println("Area del circulo: " + circle.calculateArea());
		System.out.println("Area del rectangulo: " + rectangle.calculateArea());
		System.out.println("Area del Triangulo: " + triangle.calculateArea());
	}

}
