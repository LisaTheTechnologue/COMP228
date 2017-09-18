package exercise2;

public class Patient {
	int patientID;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	String lname;

	public String getLName() {
		return lname;
	}

	public void setLName(String lname) {
		this.lname = lname;
	}

	String fname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String province;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	String postalcode;

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public Patient() {
		super();
	}

	public void getPatientInfo() {
		System.out.println("Patient ID: " + patientID);
		System.out.println("Name: " + fname + ", " + lname);
		System.out.println("Address: " + address + ", " + city + ", " + province);
		System.out.println("Postal Code: " + postalcode);
	}

}
