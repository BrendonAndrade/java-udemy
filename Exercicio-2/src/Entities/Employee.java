package Entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary(){
		return this.grossSalary - this.tax;
	}

	public void IncreaseSalary(double percentage){
		grossSalary += grossSalary * (percentage/100);
	}

	public String toString(){
		return this.name + ", $ " + this.NetSalary();
	}
}
