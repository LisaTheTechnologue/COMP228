package exercise4;

import javax.swing.JOptionPane;

import exercise3.BankAccount;

public class GameObjectTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Fantasy Game!\nLet create your warrior!");

		// user initialize account
		int objCenterX = Integer.parseInt(JOptionPane.showInputDialog("Center X: "));
		int objCenterY = Integer.parseInt(JOptionPane.showInputDialog("Center Y: "));
		double objVelocity = Double.parseDouble(JOptionPane.showInputDialog("Velocity: "));
		// user create -> alive is default
		int objRotation = Integer.parseInt(JOptionPane.showInputDialog("Rotation: "));
		GameObject myWarrior = new GameObject(objCenterX,objCenterY,objVelocity,true,objRotation);

		// display user input
		String message = "Your Warrior: \n" + GameObject.getGameObjInfo();
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
