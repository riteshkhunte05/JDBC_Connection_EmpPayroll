package com.bridgelabz.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import com.mysql.jdbc.Driver;


public class EmployeePayrollService {
		private static final String url = "jdbc:mysql://localhost:3306/employee_payroll";
		private static final String userName = "root";
		private static final String password = "Password@123";

		public void checkDatabaseConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				Connection con;
				try {
					con = DriverManager.getConnection(url, userName, password);
					System.out.println("Connnection Established" + con);
					listDrivers();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}

		private void listDrivers() {
			Enumeration<java.sql.Driver> driverList = DriverManager.getDrivers();
			while(driverList.hasMoreElements()) {
				Driver driverClass = (Driver)driverList.nextElement();
				System.out.println(" "+driverClass.getClass().getName());
			}
		}

	}


