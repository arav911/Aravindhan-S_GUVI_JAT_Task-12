//Package creation
package com.example.hrtest;

//Importing the com.example.hr package for accessing the Employee calss 
import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
//		Object creation for Employee class
		Employee employee1 = new Employee("Aravindhan", 1001, 30000);
//		Accessing methods from Employee class
		employee1.printName();
		employee1.printSalary();
		
		Employee employee2 = new Employee("Scofield", 1003, 20000);
		employee2.printName();
		employee2.printSalary();
	}
}
