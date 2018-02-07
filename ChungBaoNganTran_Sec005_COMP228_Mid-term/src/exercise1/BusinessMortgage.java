package exercise1;

public class BusinessMortgage extends Mortgage{
	public double businessInsurance;
	
	public double getBusinessInsurance() {
		return businessInsurance;
	}

	public void setBusinessInsurance(double businessInsurance) {
		if(businessInsurance > 0 ) {
			this.businessInsurance = businessInsurance;
		}
	}

	//constructor
	public BusinessMortgage(int mortageNum, String customerName, Date customerDOB, Address customerAddress,
			double mortgageAmount, double rateOfInt, double businessInsurance) {
		super(mortageNum, customerName, customerDOB, customerAddress, mortgageAmount, rateOfInt);
		this.businessInsurance = businessInsurance;
	}
	
	//method
	@Override
	public double CalculateMonthlyMortgageInstallment() {
		return mortgageAmount * rateOfInt /12 + businessInsurance;
	}

	//toString
	@Override
	public String toString() {
		return "\nBusiness Mortgage \n-----\nMortage Number: " + mortageNum
				+ "\nCustomer Name: " + customerName + "\nCustomer D.O.B: " + customerDOB + "\nCustomer Address: "
				+ customerAddress + "\nMortgage Amount: " + mortgageAmount + "\nRate Of Int: " + rateOfInt 
				+ "\nBusiness Insurance:" + businessInsurance + "\nMonthly Mortgage Installment: " + this.CalculateMonthlyMortgageInstallment();
	}

	
}
