package exercise2;

import java.util.Scanner;

public class PatientTest {

	public static void main(String[] args) {
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		// create an Patient object and assign it to patient
		Patient patient = new Patient();

		// prompt user
		System.out.println("Please enter the patient ID:");
		int ptId = Integer.parseInt(input.nextLine()); // read a line of text
		patient.setPatientID(ptId);

		System.out.println("Please enter the patient last name:");
		String ptLName = input.nextLine(); // read a line of text
		patient.setLName(ptLName);

		System.out.println("Please enter the patient first name:");
		String ptFName = input.nextLine(); // read a line of text
		patient.setFname(ptFName);

		System.out.println("Please enter the patient address:");
		String ptAddress = input.nextLine(); // read a line of text
		patient.setAddress(ptAddress);
		
		System.out.println("Please enter the patient city:");
		String ptCity = input.nextLine(); // read a line of text
		patient.setCity(ptCity);
		
		System.out.println("Please enter the patient province:");
		String ptProvince = input.nextLine(); // read a line of text
		patient.setProvince(ptProvince);
		
		System.out.println("Please enter the patient postal code:");
		String ptPC = input.nextLine(); // read a line of text
		patient.setPostalcode(ptPC);
		
		System.out.println(); // outputs a blank line

		// display
		patient.getPatientInfo();
	}

}
