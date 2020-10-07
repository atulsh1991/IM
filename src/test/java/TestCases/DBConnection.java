package TestCases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnection {

	@Test(priority = 1)
	public void DBConnectionandSqlScriptExecution() throws InterruptedException {
		Connection conn = null;
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=MobaIM;";
		String Username = "Onguard";
		String Password = "beschuit";
		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(connectionUrl, Username, Password);
			String sqlQuery = "select count(*) as count from actions where comments='always action'";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sqlQuery);
			while (result.next())

				System.out.println(result.getString("count"));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				conn = null;
			}
		}
		Thread.sleep(3000);
	}

}
