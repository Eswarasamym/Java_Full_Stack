package net.javaguides.ems.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.EmployeeService;

@AllArgsConstructor
@RestController
//@RequestMapping("/api/employess")
@RequestMapping("/api/employees")


public class EmployeeController {
	
	private EmployeeService empolyeeservice;
	
	
	
	//Build add Employee resty api
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeedto)
	{
		EmployeeDto savedEmployee=empolyeeservice.createEmployee(employeedto);
		System.out.println("employee data inserted sucessfully");
		//return new ResponseEntity<>(savedEmployee,HttpStatus.CONTINUE);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

		
	}
	
	//Build Get Employee REST API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getemployeeById(@PathVariable("id") Long employeeId)
	{
		EmployeeDto employeedto=empolyeeservice.getemployeeById(employeeId);
		return ResponseEntity.ok(employeedto);
	}

}
