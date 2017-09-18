package exercise3;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to ABC Bank!\nLet's create an account!");

		// user initialize account
		int accID = Integer.parseInt(JOptionPane.showInputDialog("Account ID: "));
		String accName = JOptionPane.showInputDialog("What is your account name?");
		double accBalance = Double.parseDouble(JOptionPane.showInputDialog("Your balance is: "));
		BankAccount myAccount1 = new BankAccount(accID, accName, accBalance);

		// display user input
		String message = "Your account: \n" + BankAccount.getAccountInfo();
		JOptionPane.showMessageDialog(null, message);

		// just initialize or update
		int reply = JOptionPane.showConfirmDialog(null, "To continue, press OK.\nTo end, press No", "Continue?",
				JOptionPane.YES_NO_OPTION);

		// update
		if (reply == JOptionPane.YES_OPTION) {
			String accChoice = JOptionPane.showInputDialog("Debit or Credit");
			Double accAmount = Double.parseDouble(JOptionPane.showInputDialog("Amount: "));
			BankAccount.debitOrCredit(accChoice, accAmount);
			String accResult = "Your account: \n" + BankAccount.getAccountInfo();
			JOptionPane.showMessageDialog(null, accResult);

		}
	}

}
