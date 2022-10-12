package deloitte.demo.day07.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// make a connection to database 
// execute a query 
// process the result-set 

public class JdbcDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		String url = "jdbc:mysql://localhost:3306/deloitte";
		String user = "root";
		String password = "root";
		String sql = "SELECT * FROM emp WHERE eid = 101";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			System.out.println(con);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deloitte", "root", "root");
			System.out.println(con);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getInt(4));

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something is wrong!");
		}
		System.out.println("End");
	}

}
