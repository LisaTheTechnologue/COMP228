package exercise3;

public class BankAccount {
	static int accnumber;

	public int getAccnumber() {
		return accnumber;
	}

	static String name;

	public String getName() {
		return name;
	}

	static double balance;

	public double getBalance() {
		return balance;
	}

	public BankAccount(int accnumber, String name, double balance) {
		super();
		BankAccount.accnumber = accnumber;
		BankAccount.name = name;
		BankAccount.balance = balance;
	}

	public static void debitOrCredit(String userChoice, double money) {
		if (userChoice.toLowerCase().equals("debit") ) {
			balance += money;
		} else if (userChoice.toLowerCase().equals("credit")) {
			balance -= money;
		}
	}

	public static String getAccountInfo(String userName) {
		String stringFormat ="";
		if (userName.equals(name)) {
		stringFormat = String.format("Account ID: %s%nName: %s%nBalance: %s%n", accnumber, name, balance);
		}
		return stringFormat;
	}
}
