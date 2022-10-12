package deloitte.demo.day07.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class JdbcDemo2 {

	public static void main(String[] args) {

		System.out.println("Start");

		String url = "jdbc:mysql://localhost:3306/deloitte_oct22";
		String user = "root";
		String password = "root";
		String sql = "SELECT * FROM emp";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			rsmd = rs.getMetaData();

			while (rs.next()) {
				for (int i = 1; i < rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something is wrong!");
		}
		System.out.println("End");
	}

}
