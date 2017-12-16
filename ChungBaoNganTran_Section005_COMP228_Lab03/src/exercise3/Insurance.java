package exercise3;

public class Insurance {
	protected String policyNo, name;
	protected Date startDate;
	protected Address address;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Insurance(String policyNo, String name, Address address, Date startDate) {
		this.policyNo = policyNo;
		this.name = name;
		this.address = address;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Insurance [policyNo=" + policyNo + ", name=" + name + ", address=" + address + ", startDate="
				+ startDate + "]";
	}
}
