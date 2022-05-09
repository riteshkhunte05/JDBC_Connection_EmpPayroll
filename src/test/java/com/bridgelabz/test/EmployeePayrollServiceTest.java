package com.bridgelabz.test;

import java.sql.SQLException;

import org.junit.Test;

import com.bridgelabz.main.EmployeePayrollService;

public class EmployeePayrollServiceTest {
	/**
	 * test case to check database connected or not
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void givenEmployeePayrollDatabase_ShouldConnectToDatabase() throws ClassNotFoundException, SQLException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.checkDatabaseConnection();
	}

	/**
	 * test cases to test data retrieval from database
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	@Test
	public void givenEmployeePayrollDatabase_ShouldRetrieveData() throws ClassNotFoundException, SQLException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.selectData();
	}
}