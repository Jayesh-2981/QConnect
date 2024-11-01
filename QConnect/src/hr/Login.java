package hr;

import java.util.Scanner;

public class Login {
	Scanner scanner = new Scanner(System.in);
	HR hr;

	public void login() {
		for (;;) {
			System.out.println("1. LOGIN");
			System.out.println("2. Create Account");
			System.out.println();
			System.out.print("Enter an option : ");

			int opt = scanner.nextInt();
			switch (opt) {
			case 1: {
				loginHR();
				break;
			}
			case 2: {
				createAccount();
				break;
			}
			default:
				System.out.println("Wrong Option Entered");
			}
		}
	}

	private void createAccount() {
		System.out.println("ACCOUNT CREATION MODULE");

		System.out.print("Username : ");
		String un = scanner.next();
		System.out.print("Contact : ");
		long cont = scanner.nextLong();
		System.out.print("Password : ");
		String pass = scanner.next();
		System.out.print("Email : ");
		String email = scanner.next();

		hr = new HR(un, cont, pass, email);
	}

	private void loginHR() {
		if (hr != null) {
			System.out.println("LOGIN MODULE");
			for (int i = 1; i <= 3; i++) {
				System.out.print("Username : ");
				String un = scanner.next();
				System.out.print("Password : ");
				String pass = scanner.next();

				if (un.equals(hr.name) && pass.equals(hr.pass)) {
					HomePage homepage = new HomePage();
					homepage.features();
				} else {
					System.out.println("Wrong Credentials");
				}
			}
			System.out.println("Forgot Password : ");
			boolean cndt = scanner.nextBoolean();

			if (cndt) {
				ForgotPassword forgotPassword = new ForgotPassword();
				forgotPassword.forgotPassWord();
			}
		} else {
			System.out.println("CREATE YOUR ACCOUNT FIRST");
		}
	}

}
