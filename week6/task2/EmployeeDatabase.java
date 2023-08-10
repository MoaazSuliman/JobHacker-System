package week6.task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import week6.task1.DatabaseConnection;

public class EmployeeDatabase extends DatabaseConnection {
	private static Connection connection;
	private static String sql;
	private static PreparedStatement s;
	private static ResultSet result;

	public static void createTable() throws SQLException {
		connection = createConnection();
		sql = "CREATE TABLE Employee (id INT PRIMARY KEY AUTO_INCREMENT , f_name TEXT , l_name TEXT , "
				+ "sex TEXT , age INT , address TEXT , phone_number TEXT , vaction_balance INT)";
		s = connection.prepareStatement(sql);
		s.execute();
		System.out.println("Create Table Successfully...");
	}

	public static void addEmployee(Employee employee) throws SQLException {
		connection = createConnection();
		sql = "INSERT INTO Employee (f_name  , l_name  , sex , age  , address  , phone_number  , vaction_balance  ) VALUES(? , ? , ? , ? , ? , ? , ?)";
		s = connection.prepareStatement(sql);
		s.setString(1, employee.getFirstName());
		s.setString(2, employee.getLastName());
		s.setString(3, employee.getSex());
		s.setInt(4, employee.getAge());
		s.setString(5, employee.getAddress());
		s.setString(6, employee.getPhoneNumber());
		s.setInt(7, employee.getVactionBalance());
		s.execute();
		System.out.println("Inserted Employee Successfully");

	}

	public static void updateVactionEmployeeThatHasMrOrMsInTheFirstName(int employeeId) throws SQLException {
		connection = createConnection();
		sql = "UPDATE Employee SET vaction_balance= 45 WHERE id = " + employeeId;
		s = connection.prepareStatement(sql);
		s.execute();
		System.out.println("Update Successfully");
	}

	public static ArrayList<Employee> getAllEmployees() throws SQLException {
		ArrayList<Employee> employees = new ArrayList<>();
		connection = createConnection();
		sql = "SELECT * FROM Employee";
		s = connection.prepareStatement(sql);
		result = s.executeQuery();
		while (result.next())
			employees.add(new Employee(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
					result.getInt(5), result.getString(6), result.getString(7), result.getInt(8)));
		System.out.println("Get All Employees Successfully...");
		return employees;
	}

}
