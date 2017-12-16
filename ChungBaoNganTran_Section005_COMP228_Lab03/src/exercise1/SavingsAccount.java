package exercise1;

public class SavingsAccount {

	/*
	 * Write a Java application that implements the following class(s) as per
	 * business requirements mentioned below:
	 * 
	 * Create a driver class – SavingAccountTest(SavingAccountTest.java) which tests
	 * above class by at least creating two objects of the SavingAccount class.
	 */
	private final int accNum ;

	public int getAccNum() {
		return accNum;
	}

	private String cusName;

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	private Date cusDOB;

	public Date getCusDOB() {
		return cusDOB;
	}

	public void setCusDOB(Date cusDOB) {
		this.cusDOB = cusDOB;
	}

	private double accBalance;

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		if (accBalance >= 100.00) {
			this.accBalance = accBalance;
		}
	}

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		if (interestRate >= 0.001 && interestRate <= 0.02) {
			this.interestRate = interestRate;
		}
	}

	public SavingsAccount(int accNum, String cusName, Date cusDOB, double accBalance, double interestRate) {
		this.accNum = accNum;
		this.cusName = cusName;
		this.cusDOB = cusDOB;
		this.accBalance = accBalance;
		this.interestRate = interestRate;
	}

	public SavingsAccount(int accNum, String cusName, Date cusDOB) {
		this.accNum = accNum;
		this.cusName = cusName;
		this.cusDOB = cusDOB;
	}

	public double Deposit(double amount) {
		return this.accBalance + amount;
	}

	public double Withdraw(double amount) {
		if (amount >= 20.00 && this.accBalance >= 100.00) {
			amount -= 1.50;
			return this.accBalance - amount;
		} else {
			System.out.println("Minimum amount is $20.00");
			return this.accBalance;
		}
	}

	public double calculateMonthlyInterest() {
		return (this.accBalance * this.interestRate);
	}

	@Override
	public String toString() {
		return "Account No: " + accNum + "\nCustomer Name: " + cusName + "\nD.O.B: " + cusDOB
				+ "\nBalance: $" + accBalance + "\nInterest Rate: " + interestRate + "%\n";
	}

}
