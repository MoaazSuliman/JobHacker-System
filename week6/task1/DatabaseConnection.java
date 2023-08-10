package week6.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

	private static String host = "jdbc:mysql://localhost:3306/jobhackercommunity";
	private static String user = "root";
	private static String password = "";

	public static Connection createConnection() {
		try {
			return DriverManager.getConnection(host, user, password);
		} catch (Exception e) {
			System.out.println("Catch ===> " + e.getMessage());
		}
		return null;
	}

	public void closeConnectionWithResult(Connection connection, PreparedStatement s, ResultSet res)
			throws SQLException {
		connection.close();
		s.close();
		res.close();
	}

	public void closeConnection(Connection connection, PreparedStatement s) throws SQLException {
		connection.close();
		s.close();
	}
}
