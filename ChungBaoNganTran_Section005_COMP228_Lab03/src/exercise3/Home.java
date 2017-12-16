package exercise3;

public class Home extends Insurance {
	/*
	 * iii) Implements method - double calculateYearlyPremium() which calculates
	 * home insurance as per the following business requirements a. if home is <= 15
	 * years old, and size/area is between 0 and 2500 sq. feet, then monthly premium
	 * is 150.00 dollars b. if home is <= 15 years old, and size/area is between
	 * 2500 and 5000 sq. feet, then monthly premium is 300.00 dollars c. if home is
	 * > 15 years old, size/area is between 0 and 2500 sq. feet, then monthly
	 * premium is 250.00 dollars d. if home is > 15 years old, size/area is between
	 * 2500 and 5000 sq. feet, then monthly premium is 500.00 dollars
	 */
	protected int size, year;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (0 < size && size <= 2500) {
			this.size = size;
		} else if (2500 < size && size <= 5000) {
			this.size = size;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Home Insurance: \nSize:" + size + "\nYear:" + year + "\nPolicy No: " + policyNo + "\nName: " + name
				+ "\nAddress: " + address + "\nStart Date: " + startDate;
	}

	public double calculateYearlyPremium() {
		if (year <= 15 && (size >= 0 && year <= 2500)) {
			return 150.00;
		} else if (year <= 15 && (size > 2500 && size < 5000)) {
			return 300.00;
		} else if (year > 15 && (size >= 0 && size <= 2500)) {
			return 250.00;
		} else if (year > 15 && (size <= 2500 && size >= 5000)) {
			return 500.00;
		} else
			return 0.00;

	}

	public Home(String policyNo, String name, Address address, Date startDate, int size, int year) {
		super(policyNo, name, address, startDate);
		this.size = size;
		this.year = year;
	}
}
