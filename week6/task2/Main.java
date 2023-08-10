package week6.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			// CREATE TABLE IN OUR DATABASE
			EmployeeDatabase.createTable();
			// INIT EMPLOYEES
			ArrayList<Employee> employees = new ArrayList<>();
			employees.add(new Employee(1, "MR.John", "Doe", "Male", 30, "123 Main St", "555-1234", 15));
			employees.add(new Employee(2, "MR.Jane", "Smith", "Female", 28, "456 Elm St", "555-5678", 20));
			employees.add(new Employee(3, "MR.Michael", "Johnson", "Male", 35, "789 Oak St", "555-9876", 18));
			employees.add(new Employee(4, "MS.Emily", "Brown", "Female", 25, "567 Maple St", "555-4321", 25));
			employees.add(new Employee(5, "MS.David", "Williams", "Male", 40, "234 Pine St", "555-8765", 12));
			employees.add(new Employee(6, "Sophia", "Jones", "Female", 29, "789 Cedar St", "555-5678", 30));
			employees.add(new Employee(7, "Matthew", "Taylor", "Male", 33, "678 Birch St", "555-2345", 8));
			employees.add(new Employee(8, "Olivia", "Wilson", "Female", 27, "123 Elm St", "555-7890", 22));
			employees.add(new Employee(9, "Ethan", "Harris", "Male", 31, "345 Oak St", "555-6543", 16));
			employees.add(new Employee(10, "Ava", "Martin", "Female", 26, "567 Maple St", "555-9876", 24));
			// for each to use add employee that had implemented in the database class
			for (Employee emp : employees)
				EmployeeDatabase.addEmployee(emp);
			System.out.println("Employyeed Addedd Successfully...");
			// UPDATE IN EMP THAT HAVE MR OR MS IN THE FIRST NAME
			for (Employee emp : employees) {
				if (emp.getFirstName().contains("MR") || emp.getFirstName().contains("MS"))
					EmployeeDatabase.updateVactionEmployeeThatHasMrOrMsInTheFirstName(emp.getId());
			}
			System.out.println("Employyeed Updated Successfully...");
			// GET ALL EMPS AFTER UPDATES.
			System.out.println("Get All Emps: ");
			for (Employee emp : EmployeeDatabase.getAllEmployees())
				System.out.println(emp.toString());

			System.out.println("Thanks.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
