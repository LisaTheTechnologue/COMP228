package exercise1;

import java.util.Random;

import javax.swing.JOptionPane;

import java.lang.Math;

/*
 -	create a method to simulate the questions – simulateQuestion
-	create a method to check the answer – checkAnswer
-	create a method to display a random message for the user – generateMessage
-	create a method to interact with the user - inputAnswer
*/
public class QuestionBank {

	private int correct = 0;
	private int total = 5;
	private int count = 1;

	private String simulateQuestion(String qNumber) {
		String question = "";

		switch (qNumber) {
		case "q1":
			question += "Which one is the correct type format in Java (eclipse)?\n" + "A. bool\n" + "B. Int\n"
					+ "C. integer\n" + "D.String";
			break;
		case "q2":
			question += "Which one is written in correct format?\n" + "A.System.out.println('%d%n','name');\n"
					+ "B.System.out.println(%d%n,'name');\n" + "C.System.out.println(name);\n"
					+ "D.System.out.printf('%s%n','name');";
			break;
		case "q3":
			question += "Which value of x that the program returns false?\n"
					+ "if(x!=10 || x >= 9)\n{\nreturn true\n}\n" + "A. x = 8\n" + "B. x = 9\n" + "C. x = 10\n"
					+ "D. x = 11";
			break;
		case "q4":
			question += "For a Java developer, which is a wrong naming convention?\n"
					+ "A. Variable names start with a lowercase character for the first word and uppercase for every other word\r\n"
					+ "B. Classes start with an uppercase character of every word\r\n"
					+ "C. Methods start with a lowercase character for the first word and lowercase for every other word\r\n"
					+ "D. Packages use only lowercase characters\r\n";
			break;
		case "q5":
			question += "a = ?\n" + "int a = 2 * 9 + 20 % 9;\n" + "A. 1\n" + "B. 2\n" + "C. 19\n" + "D. 20\n";
			break;
		}

		return question;

	}

	protected void checkAnswer(String qNumber, String input) {
		String ans = "";
		input.toLowerCase();
		boolean userMes = false;
		switch (qNumber) {
		case "q1":
			if (input.equals("d")) {
				correct++;
				userMes = true;
			} else
				ans += "\nThe correct answer is: D";
			break;
		case "q2":
			if (input.equals("d")) {
				correct++;
				userMes = true;
			} else
				ans += "\nThe correct answer is: D";
			break;
		case "q3":
			if (input.equals("a")) {
				correct++;
				userMes = true;
			} else
				ans += "\nThe correct answer is: A";
			break;
		case "q4":
			if (input.equals("c")) {
				correct++;
				userMes = true;
			} else
				ans += "\nThe correct answer is: C";
			break;
		case "q5":
			if (input.equals("d")) {
				correct++;
				userMes = true;
			} else
				ans += "\nThe correct answer is: D";
			break;
		}
		JOptionPane.showConfirmDialog(null, this.generateMessage(userMes) + ans);
	}

	protected String generateMessage(boolean userAns) {
		Random randomObject = new Random();
		String sysReply = "";
		if (userAns) {
			switch (randomObject.nextInt(4)) {
			case 0:
				return ("Very good!");
			case 1:
				return ("Excellent!");
			case 2:
				return ("Keep up the good work!");
			case 3:
				return ("Good!");
			}
		} else {
			switch (randomObject.nextInt(4)) {
			case 0:
				return ("No. Please try again");
			case 1:
				return ("Wrong. Try once more");
			case 2:
				return ("Don't give up!");
			case 3:
				return ("No. Keep trying..");
			}
		}
		return sysReply;
	}

	protected String inputAnswer() {
		while (count <= 5) {
			String answer = JOptionPane.showInputDialog(simulateQuestion("q" + Integer.toString(count)));
			if (answer.toLowerCase().equals("a") || answer.toLowerCase().equals("b") || answer.toLowerCase().equals("c")
					|| answer.toLowerCase().equals("d")) {
				this.checkAnswer("q" + Integer.toString(count), answer);
				count++;
			} else
				JOptionPane.showConfirmDialog(null, "Make sure you enter 'a', 'b', 'c' or 'd'");
		}

		double percent = ( (double)correct / (double)total ) * 100 ;

		while (count == 6) {
			JOptionPane.showConfirmDialog(null, "Congrats! You have finished the test!\nCorrect answer: " + correct
					+ "\nIncorrect answer: " + (total - correct) + "\nPercentage of correct answer: " + percent + "%");
			count++;
		}

		return "";
	}

}
