package hr;

import java.util.ArrayList;

public class Student {
	String name;
	long contact;
	String email;
	String address;
	String gender;
	ArrayList<Education> educationList = new ArrayList<>();

	public Student(String name, long contact, String email, String address, String gender,
			ArrayList<Education> educationList) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.educationList = educationList;
	}

}
