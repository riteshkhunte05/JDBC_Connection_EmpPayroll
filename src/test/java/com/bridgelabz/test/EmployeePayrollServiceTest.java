package com.bridgelabz.test;

import java.sql.SQLException;

import org.junit.Test;

import com.bridgelabz.main.EmployeePayrollException;
import com.bridgelabz.main.EmployeePayrollService;

import junit.framework.Assert;

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

	/**
	 * test case to update the salary
	 * 
	 * @throws EmployeePayrollException
	 */
	@Test
	public void givenEmployeePayrollDatabase_ShouldUpdateSalary() throws EmployeePayrollException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		boolean result = employeePayrollService.updateSalary();
		Assert.assertTrue(result);

	}

	/**
	 * test case to update the salary using prepared statement
	 * 
	 * @throws EmployeePayrollException
	 */
	@Test
	public void givenEmployeePayrollDatabase_ShouldUpdateSalaryUsingPreparedStatement()
			throws EmployeePayrollException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		boolean result = employeePayrollService.updateSalaryPrepared();
		Assert.assertTrue(result);

	}

	/**
	 * test case to retrieve the employee by name using prepared statement
	 * 
	 * @throws EmployeePayrollException
	 */
	@Test
	public void givenEmployeePayrollDatabase_ShouldReturnEmployeeDetailsUsingPreparedStatement()
			throws EmployeePayrollException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		boolean result = employeePayrollService.retrievePrepared("Tersia");
		Assert.assertTrue(result);

	}
}