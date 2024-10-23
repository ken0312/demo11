package com.example.demo11;

public class Employee {

	private String id;

	private String name;

	private int age;

	private String gender;

	// ��۩w�q����� HomeTown ���O�� Employee ���ݩʤ��@
	private HomeTown homeTown;

	public Employee() {
		super();
	}

	public Employee(String id, String name, int age, String gender, HomeTown homeTown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.homeTown = homeTown;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public HomeTown getHomeTown() {
		return homeTown;
	}

}
