package com.dp.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new LinkedList<Employee>();
		//Employee employee = null;
		for (int i = 0; i < 100; i++) {

			Employee employee = Employee.getInstance();
			employee.setId(i);
			employees.add(employee);
			System.out.println(employee.hashCode());

		}
		System.out.println(employees.size());
		
		for (Employee employee : employees) {
			System.out.println(employee.getId());
		}
	}

}
