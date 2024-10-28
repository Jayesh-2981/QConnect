package hr;

public class HR {

	String name;
	long contact;
	String pass;
	String email;

	public HR(String name, long contact, String pass, String email) {
		super();
		this.name = name;
		this.contact = contact;
		this.pass = pass;
		this.email = email;
	}

	@Override
	public String toString() {
		return "HR [name=" + name + ", contact=" + contact + ", pass=" + pass + ", email=" + email + "]";
	}

}
