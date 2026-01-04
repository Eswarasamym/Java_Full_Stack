package net.javaguides.ems.mpper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {
	
	public static EmployeeDto maptoEmployeeDto(Employee employee)
	{
		 if (employee == null) {
	            return null; // handle null safely
	        }
		EmployeeDto employeedto= new EmployeeDto(
				employee.getId(),
				employee.getFirstname(),
				employee.getLastname(),
				employee.getEmail());
		return employeedto;
	}
	
	public static Employee mapToEmployee(EmployeeDto employeedto) {
		Employee employee= new Employee();
				//employee.setFirstname(employeedto.getId()); 
				employee.setFirstname(employeedto.getFirstname());
				employee.setLastname (employeedto.getLastname());
				employee.setEmail (employeedto.getEmail());
				
				System.out.println(employeedto.getFirstname());
				System.out.println(employeedto.getLastname());
				System.out.println(employeedto.getEmail());
				
		return employee;
	}

}
