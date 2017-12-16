package exercise2;

public class Employees {
	protected final String firstName, lastName, socialSecurityNumber;

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	
	public Employees(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}


	@Override
	public String toString() {
		return "Employees: " + firstName + " " + lastName + "\nSocial Security Number: "
				+ socialSecurityNumber ;
	}
	 
}
