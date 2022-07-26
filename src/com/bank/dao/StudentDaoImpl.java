/**
 * 
 */
package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * @author win 10
 *
 */
public class StudentDaoImpl implements StudentDao {

	private static Logger logger = Logger.getLogger(StudentDaoImpl.class);

	Connection conn = null;
	PreparedStatement stmt = null;

	@Override
	public boolean addCourse() {
		// TODO Auto-generated method stub
		// all queries with insert operations
		return false;
	}

	@Override
	public boolean verifyUser(String username, String password) {
		System.out.println(logger.getName());
		logger.info("Hello");
		
		System.out.println("Veriffy---=-------------------------------------------------------------------------------");
		try {
			// database
			Class.forName("com.mysql.jdbc.Driver");

			// Step 4 make/open a connection

			logger.info("Connecting to database...");
			conn = DriverManager.getConnection(DatabaseConfig.DB_URL, DatabaseConfig.USER, DatabaseConfig.PASS);
			String sql = "SELECT student_username, student_password FROM student";
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			logger.debug("Detail of rs object: "+rs);
			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name

				if (username.equals(rs.getString("student_username"))
						&& password.equals(rs.getString("student_password"))) {
					return true;
				}
			}

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
//			se.printStackTrace();
			logger.error(se.getMessage());
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		return false;
	}

}
