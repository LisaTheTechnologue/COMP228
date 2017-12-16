package exercise1;

import javax.swing.JOptionPane;

public class QuestionBankTest {

	public static void main(String[] args) {
		try {
			QuestionBank question = new QuestionBank();
			question.inputAnswer();
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Thank you!");
		}
	}

}
