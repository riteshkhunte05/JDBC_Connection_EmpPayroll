package com.bridgelabz.test;

import org.junit.Test;

import com.bridgelabz.main.EmployeePayrollService;

public class EmployeePayrollServiceTest {

	@Test
		public void givenEmployeePayrollDatabase_ShouldConnectToDatabase() {
			EmployeePayrollService employeePayrollService = new EmployeePayrollService();
			employeePayrollService.checkDatabaseConnection();
	}

}
