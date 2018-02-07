package exercise1;

public class HouseMortgage extends Mortgage{
	public double propertyTax;
	public double infrastructureTax;
	
	//getter and setter
	public double getPropertyTax() {
		return propertyTax;
	}

	public void setPropertyTax(double propertyTax) {
		if(propertyTax >0) {
			this.propertyTax = propertyTax;
		}
	}

	public double getInfrastructureTax() {
		return infrastructureTax;
	}

	public void setInfrastructureTax(double infrastructureTax) {
		if(infrastructureTax >0) {
			this.infrastructureTax = infrastructureTax;
		}
	}

	//Constructor
	public HouseMortgage(int mortageNum, String customerName, Date customerDOB, Address customerAddress,
			double mortgageAmount, double rateOfInt, double propertyTax, double infrastructureTax) {
		super(mortageNum, customerName, customerDOB, customerAddress, mortgageAmount, rateOfInt);
		this.propertyTax = propertyTax;
		this.infrastructureTax = infrastructureTax;
	}
	
	//method
	@Override
	public double CalculateMonthlyMortgageInstallment() {
		return mortgageAmount * rateOfInt / 12 + propertyTax / 12 + infrastructureTax;
	}
	
	//toString()
	@Override
	public String toString() {
		return "\nHouse Mortgage \n-----\nMortage Number: " + mortageNum + " \nCustomer Name: " + customerName + " \nCustomer D.O.B: "
				+ customerDOB + " \nCustomer Address: " + customerAddress + " \nMortgage Amount: " + mortgageAmount
				+ " \nRate Of Interest: " + rateOfInt + "\nProperty Tax: " + propertyTax + "\nInfrastructure Tax: " + infrastructureTax
						+ "\nMonthly Mortgage Installment:" + this.CalculateMonthlyMortgageInstallment();
	}

	
}
