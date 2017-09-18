package exercise3;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to ABC Bank!");

		BankAccount myAccount1 = new BankAccount(40001, "Jolisa", 40000.52);
		
		String accName = JOptionPane.showInputDialog("What is your account name?");
		String message = "Your account: \n" + BankAccount.getAccountInfo(accName);
		JOptionPane.showMessageDialog(null, message);
		
		int reply = JOptionPane.showConfirmDialog(null, "To continue, press OK.\nTo end, press No","Continue?",JOptionPane.YES_NO_OPTION);
		
		if (reply == JOptionPane.YES_OPTION) {
		String accChoice = JOptionPane.showInputDialog("Debit or Credit");
		Double accAmount = Double.parseDouble(JOptionPane.showInputDialog("Amount: "));
		BankAccount.debitOrCredit(accChoice, accAmount);
		String accResult = "Your account: \n" + BankAccount.getAccountInfo(accName);
		JOptionPane.showMessageDialog(null, accResult);
		}
	}

}
