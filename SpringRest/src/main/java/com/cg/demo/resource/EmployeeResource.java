package com.cg.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.model.Employee;

@RestController
public class EmployeeResource {

	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("1", "MAHESH", "39000"));
		list.add(new Employee("2", "Viresh", "49000"));
		list.add(new Employee("3", "Suresh", "59000"));
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
}

