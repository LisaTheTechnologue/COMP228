package exercise1;

public class SavingsAccountTest {

	public static void main(String[] args) {
		int amount = 1000;
		System.out.println("First Account:");
		SavingsAccount acc1 = new SavingsAccount(10001,"Jackson Wang", new Date(03,26,1994),2540.00,0.018);
		System.out.println(acc1);
		System.out.println("Deposit: $" + amount);
		System.out.println("Total Balance: " + acc1.Deposit(amount));
		System.out.println();
		System.out.println("Second Account:");
		SavingsAccount acc2 = new SavingsAccount(10002,"Mark Tuan", new Date(04,10,1993));
		System.out.println(acc2);
		acc2.setAccBalance(10000.00);
		acc2.setInterestRate(0.002);
		System.out.println("Monthly Interest: " + acc2.calculateMonthlyInterest());
		System.out.println("Withdraw: $" + amount);
		System.out.println("Balance remain: " + acc2.Withdraw(amount));
		
		
	}

}
