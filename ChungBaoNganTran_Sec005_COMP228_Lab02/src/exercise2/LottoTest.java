package exercise2;

import javax.swing.JOptionPane;

public class LottoTest {

	public static void main(String[] args) {

		String op1 = JOptionPane.showInputDialog("Enter your number (between 3 and 27):");
		boolean win = false;
		for (int count = 5; count >= 1;) {
			Lotto number = new Lotto();
			int total = 0;
			// add each element's value to total
			for (int counter = 0; counter < number.arrayLotto().length; counter++) {
				total += number.arrayLotto()[counter];
			}
			if (total == Integer.parseInt(op1)) {
				JOptionPane.showConfirmDialog(null, "Sum: " + total + "\nCongratulation! You are a lucky star!");
				win = true;
				break;
			} else {
				count--;
				JOptionPane.showConfirmDialog(null,
						"Sum: " + total + ".\nYou have " + count + " roll(s) left. Continue?");

			}
		}
		if (win == false) {
			JOptionPane.showConfirmDialog(null, "Out of 5 rolls. Sorry! I have a better luck than you!");
		}
	}

}
