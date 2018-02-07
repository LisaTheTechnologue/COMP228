package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private Button btnCalc;

	@FXML
	private TextField tbPrice;

	@FXML
	private TextField tbInterest;

	@FXML
	private TextField tbDownPayment;

	@FXML
	private Label lbPrice;

	@FXML
	private Label lbDownPayment;

	@FXML
	private Label lbInterest;

	@FXML
	private Label lbResult1;

	@FXML
	private Label lbResult3;

	@FXML
	private Label lbResult4;

	@FXML
	private Label lbResult2;

	@FXML
	private Label lbResult1a;

	@FXML
	private Label lbResult3a;

	@FXML
	private Label lbResult2a;

	@FXML
	private Label lbResult4a;

	@FXML
	private Label lbOutput;

	/*
	 * The app should display the loan’s duration in months and the monthly payments
	 * for two-, three-, four- and five-year loans. The variety of options allows
	 * the user to easily compare repayment plans and choose the most appropriate.
	 */
	@FXML
	void Calc_OnClick(ActionEvent event) {
		double price = Double.parseDouble(tbPrice.getText());
		double interest = Double.parseDouble(tbInterest.getText());
		double downpayment = Double.parseDouble(tbDownPayment.getText());
		double borrowed = price - downpayment;
		lbResult1a.setText(String.format("%.2f",borrowed / (12 * 2) * (1 + interest)));
		lbResult2a.setText(String.format("%.2f",borrowed / (12 * 3) * (1 + interest)));
		lbResult3a.setText(String.format("%.2f",borrowed / (12 * 4) * (1 + interest)));
		lbResult4a.setText(String.format("%.2f",borrowed / (12 * 5) * (1 + interest)));

	}
}
