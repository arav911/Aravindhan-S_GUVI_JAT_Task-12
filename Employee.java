//Package creation
package com.example.hr;

public class Employee {

//	Declaring data members for name, id and salary
	String name;
	int id;
	float salary;
	
//	Constructor for Employee
	public Employee(String n, int ID, float sal){
		name = n;
		id = ID;
		salary = sal;
	}
	
//	Printing Employee name
	public void printName() {
		System.out.println("Employee Name: " + name);
	}
	
//	Printing Employee salary
	public void printSalary() {
		System.out.println("Employee Salary: " + salary);
	}
	
}
