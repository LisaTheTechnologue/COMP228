package exercise3;

public class Auto extends Insurance {
	protected String model, make;
	protected int year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Auto Insurance: \nModel: " + model + "\nMade at: " + make + "\nYear:" + year + "\nPolicy No: " + policyNo
				+ "\nName: " + name + "\nAddress: " + address + "\nStart Date: " + startDate;
	}

	public double calculateYearlyPremium() {
		if (year <= 5) {
			return 150.00;
		} else if (year > 5 && year <= 10) {
			return 200.00;
		} else {
			return 300.00;
		}
	}

	public Auto(String policyNo, String name, Address address, Date startDate, String model, String make, int year) {
		super(policyNo, name, address, startDate);
		this.model = model;
		this.make = make;
		this.year = year;
	}

	

	
}
