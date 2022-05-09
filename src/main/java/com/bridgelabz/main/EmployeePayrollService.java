package com.bridgelabz.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * EmployeePayrollService class demonstrated CRUD operations
 *
 */
public class EmployeePayrollService {
	private static final String url = "jdbc:mysql://localhost:3306/employee_payroll";
	private static final String userName = "root";
	private static final String password = "Password@123";

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = null;
		connection = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Established" + connection);
		return connection;

	}

	/**
	 * method to establish connection with employee payroll database
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void checkDatabaseConnection() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		listDrivers();

	}

	/**
	 * method to list the drivers
	 */
	private void listDrivers() {
		Enumeration<java.sql.Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println(" " + driverClass.getClass().getName());
		}
	}

	/**
	 * method to select data from the database
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void selectData() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getDouble(4) + " " + resultSet.getDate(5));
		}

	}

	/**
	 * method to update the salary
	 * 
	 * @return
	 * @throws EmployeePayrollException
	 */
	public boolean updateSalary() throws EmployeePayrollException {
		Connection connection;
		boolean success = false;
		try {
			connection = getConnection();
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("update employee_payroll set salary=300000 where name='Tersia'");
			if (result > 0) {
				System.out.println("updated");
				success = true;
			}
		} catch (ClassNotFoundException e) {
			throw new EmployeePayrollException("class not found");
		} catch (SQLException e) {
			throw new EmployeePayrollException("sql exception");
		}

		return success;

	}

}