package exercise1;

import java.util.Scanner;

public class BasePlusCommEmployeeTest {

	public static void main(String[] args) {
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		// create an BasePlusCommEmployee object and assign it to employee
		BasePlusCommEmployee employee = new BasePlusCommEmployee();

		// prompt user
		System.out.println("Please enter the employee ID:");
		int employeeId = Integer.parseInt(input.nextLine()); // read a line of text
		employee.setEmployeeID(employeeId);

		System.out.println("Please enter the name:");
		String employeeName = input.nextLine(); // read a line of text
		employee.setName(employeeName);

		System.out.println("Please enter the base salary:");
		int employeeSalary = Integer.parseInt(input.nextLine()); // read a line of text
		employee.setBaseSalary(employeeSalary);

		System.out.println("Please enter the commission rate:");
		double employeeCmRate = Double.parseDouble(input.nextLine()); // read a line of text
		employee.setCommissionRate(employeeCmRate);

		System.out.println("Please enter the total sales:");
		double employeeSale = Double.parseDouble(input.nextLine()); // read a line of text
		employee.setTotalSales(employeeSale);

		System.out.println(); // outputs a blank line

		//display
		employee.getEmployeeInfo();
		
	}

}

