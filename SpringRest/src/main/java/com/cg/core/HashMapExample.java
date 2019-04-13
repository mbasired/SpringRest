package com.cg.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.demo.model.Employee;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, List<Employee>> map = new HashMap<>();
		List<Employee> contractEmployees = Arrays.asList(new Employee("1", "Mahesh", "39000"),
				new Employee("2", "Viresh", "49000"), new Employee("3", "Suresh", "59000"));
		map.put("contract", contractEmployees);
		List<Employee> perminentEmployees = Arrays.asList(new Employee("1", "NAGA", "39000"),
				new Employee("2", "MALLI", "49000"), new Employee("3", "RAMNATH", "59000"));
		map.put("perminent", perminentEmployees);

		// System.out.println(map);

		// 
		for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
			if (map.containsKey("perminent")&& map.containsKey("contract"))
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
