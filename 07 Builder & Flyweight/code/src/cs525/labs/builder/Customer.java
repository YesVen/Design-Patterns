package cs525.labs.builder;

public class Customer {

	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;

	public Customer() {

	}
	
	public Customer(String firstName, String lastName, Address address, String phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isValid() {
		return address.isValid() && !(phone.isEmpty() || email.isEmpty());
	}

	public String toString() {

		return "\n\tCustomer: \n\t\tName: " + firstName + " " + lastName + "\n\t\t" + address + "\n\t\tEmail: " + email
				+ "\n\t\tPhone: " + phone;
	}

}
