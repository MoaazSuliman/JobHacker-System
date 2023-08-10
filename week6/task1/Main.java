package week6.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main extends DatabaseConnection {

	private static Connection connection;
	private static String sql;
	private static PreparedStatement s;
	private static ResultSet result;

	public static void main(String[] args) {
		try {

			// CREATE CONNECTION AND CREATE TABLE
			connection = createConnection();
//			 sql = "CREATE TABLE test(id INT PRIMARY KEY AUTO_INCREMENT , name TEXT , email TEXT)";
//			PreparedStatement s = connection.prepareStatement(sql);
//			s.execute();
//			System.out.println("Table Is Created Successfully.");
			// INSERT VALUES INTO TABLE.
			sql = "INSERT INTO test (name  , email) VALUES (? , ?)";
			s = connection.prepareStatement(sql);
			s.setString(1, "Moaaz Suliman2");
			s.setString(2, "moaazsuliman2@gmail.com");
			s.execute();

			// GET ALL VALUES FROM THIS TABLE AND PRINT IT
			sql = "SELECT * FROM test";
			s = connection.prepareStatement(sql);
			result = s.executeQuery();
			while (result.next())
				System.out.println("Id Is " + result.getInt(1) + " Name Is " + result.getString(2) + " Mail Is "
						+ result.getString(3));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
