package Application;

import Entities.Employee;

public class Program {

	public static void main(String[] args){

		Employee employee = new Employee();
		employee.name = "Brendon";
		employee.grossSalary = 6000.00;
		employee.tax = 1000.00;

		System.out.println("Employee: " + employee);

		employee.IncreaseSalary(10);

		System.out.println("Employee: " + employee);
	}
}
