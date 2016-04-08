package com.dp.flyweight;

public class Employee {
	
	private static Employee employee;

	private int id;
	private String name;
	
	private Employee(){
		super();
	}

	private Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static Employee getInstance(){
		
		if(employee==null){
			employee=new Employee();
		}
		return employee;
		
	}

}
