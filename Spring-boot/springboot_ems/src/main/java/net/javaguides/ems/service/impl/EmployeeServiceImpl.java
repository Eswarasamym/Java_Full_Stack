
package net.javaguides.ems.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;
import net.javaguides.ems.execption.ResourceNotFoundException;
import net.javaguides.ems.mpper.EmployeeMapper;
import net.javaguides.ems.repository.EmployeeRepository;
import net.javaguides.ems.service.EmployeeService;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeerespostory;
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeedto)
	
	{
		Employee employee=EmployeeMapper.mapToEmployee(employeedto);
		Employee savedEmployee=employeerespostory.save(employee);
		return EmployeeMapper.maptoEmployeeDto(savedEmployee);
	}

	   @Override
    public EmployeeDto getemployeeById(Long employeeId) {

        Employee employee = employeerespostory.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Employee not found with given id: " + employeeId
                        )
                );

        return EmployeeMapper.maptoEmployeeDto(employee);
    }

}
