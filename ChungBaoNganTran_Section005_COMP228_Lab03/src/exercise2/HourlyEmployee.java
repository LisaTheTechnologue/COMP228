package exercise2;

public class HourlyEmployee extends Employees {

	protected double hourWorked, wage;

	public double getHourWorked() {
		return hourWorked;
	}

	public void setHourWorked(double hourWorked) {
		if (hourWorked >= 0 && hourWorked <= 168) {
			this.hourWorked = hourWorked;
		}
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0) {
			this.wage = wage;
		}
	}

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourWorked,
			double wage) {
		super(firstName, lastName, socialSecurityNumber);
		this.hourWorked = hourWorked;
		this.wage = wage;
	}

	public double earnings() {
		return hourWorked * wage;
	}

	@Override
	public String toString() {
		return "Hourly Employee: " + firstName + " " + lastName + "\nSocial Security Number: " + socialSecurityNumber
				+ "\nHour Worked: " + hourWorked + "\nWage: " + wage;
	}
}
