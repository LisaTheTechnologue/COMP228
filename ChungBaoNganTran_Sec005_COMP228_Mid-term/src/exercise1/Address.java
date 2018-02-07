package exercise1;

public class Address {
	protected int houseNum;
	protected String street, city, province, zipCode;
	
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return houseNum + ", " + street + ", " + city + ", " + province
				+ ", " + zipCode ;
	}
	public Address(int houseNum, String street, String city, String province, String zipCode) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.province = province;
		this.zipCode = zipCode;
	}
	
	
}
