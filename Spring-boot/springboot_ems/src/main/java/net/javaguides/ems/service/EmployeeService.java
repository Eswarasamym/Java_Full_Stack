package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

public interface EmployeeService {
	 EmployeeDto createEmployee(EmployeeDto employeedto);
	 
	 
	 EmployeeDto getemployeeById(Long employeeId);
	

}
