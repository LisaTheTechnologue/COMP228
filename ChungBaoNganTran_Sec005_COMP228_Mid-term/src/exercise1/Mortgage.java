package exercise1;

public abstract class Mortgage {
	//definition
	public int mortageNum;
	public String customerName;
	public Date customerDOB;
	public Address customerAddress;
	public double mortgageAmount;
	public double rateOfInt;
	
	//getter and setter
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getCustomerDOB() {
		return customerDOB;
	}
	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public double getMortgageAmount() {
		return mortgageAmount;
	}
	public void setMortgageAmount(double mortgageAmount) {
		if(mortgageAmount > 0) {
			this.mortgageAmount = mortgageAmount;
			}
	}
	public double getRateOfInt() {
		return rateOfInt;
	}
	public void setRateOfInt(double rateOfInt) {
		if(rateOfInt > 0 && rateOfInt <= 0.05) {
			this.rateOfInt = rateOfInt;
		}
	}
	public final int getMortageNum() {
		return mortageNum;
	}
	//overloaded constructors
	//all instances
	public Mortgage(int mortageNum, String customerName, Date customerDOB, Address customerAddress, double mortgageAmount,
			double rateOfInt) {
		super();
		this.mortageNum = mortageNum;
		this.customerName = customerName;
		this.customerDOB = customerDOB;
		this.customerAddress = customerAddress;
		this.mortgageAmount = mortgageAmount;
		this.rateOfInt = rateOfInt;
	}
	//some
	public Mortgage(int mortageNum, String customerName, Date customerDOB, Address customerAddress) {
		super();
		this.mortageNum = mortageNum;
		this.customerName = customerName;
		this.customerDOB = customerDOB;
		this.customerAddress = customerAddress;
	}
	
	//abstract method
	public abstract double CalculateMonthlyMortgageInstallment() ;
	
	@Override
	public String toString() {
		return "Mortgage\n-----\nMortage Number: " + mortageNum + "\nCustomer Name: " + customerName + "\nCustomer D.O.B: " + customerDOB
				+ "\nCustomer Address:" + customerAddress + "\nMortgage Amount: " + mortgageAmount + "\nRate Of Int:"
				+ rateOfInt;
	}
	
	
}
