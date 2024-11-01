package hr;

import java.util.ArrayList;
import java.util.Scanner;

public class HomePage {
	Scanner scanner = new Scanner(System.in);

	public void features() {
		System.out.println("HOME PAGE");
		System.out.println("1. Add Student");
		System.out.println("2. Edit Student");
		System.out.println("3. Add Mock Rating");
		System.out.println("4. Update Mock Rating");
		System.out.println("5. Placed Student");
		System.out.println("6. Requirement");
		System.out.println("7. Update Profile");
		System.out.println("8. Logout");

		System.out.print("Enter an option");
		int opt = scanner.nextInt();
		switch (opt) {
		case 1: {
			addStudent();
			break;
		}
		default:
			System.out.println("Wrong Option Entered");
			break;
		}
	}

	private void addStudent() {

		System.out.println("Student Details");

		System.out.print("Name :");
		String name = scanner.nextLine();
		System.out.print("Contact : ");
		long contact = scanner.nextLong();
		System.out.print("Email : ");
		String email = scanner.next();
		System.out.print("Address : ");
		String address = scanner.nextLine();
		System.out.print("Gender : ");
		String gender = scanner.next();
		ArrayList<Education> list = addEducation();

		Student student = new Student(name, contact, email, address, gender, list);
	}

	private ArrayList<Education> addEducation() {
		ArrayList<Education> list = new ArrayList<Education>();

		for (;;) {
			System.out.println("Enter Education Details ");

			System.out.println("Qualification : ");
			String qual = scanner.nextLine();
			System.out.println("College/School Name : ");
			String college = scanner.nextLine();
			System.out.println("University : ");
			String university = scanner.nextLine();

			String stream = null;
			if (!(qual.equals("10") || qual.equals("12"))) {
				System.out.println("Stream : ");
				stream = scanner.nextLine();
			}

			System.out.println("YOP : ");
			int yop = scanner.nextInt();
			System.out.println("Cgpa/Percentage : ");
			double cgpa = scanner.nextDouble();
		}

	}

}
