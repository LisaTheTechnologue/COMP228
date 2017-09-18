package exercise1;

public class BasePlusCommEmployee {

	int employeeID;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int baseSalary;

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	double commissionRate;

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	double totalSales;

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public BasePlusCommEmployee() {
		super();
	}

	public double calculateCommission() {
		return (baseSalary + commissionRate * totalSales / 100);
	}

	public void getEmployeeInfo() {
		System.out.println("Employee ID: " + employeeID + "\nName: " + name + "\nBase salary: " + baseSalary
				+ "; Commission rate: " + commissionRate + "; Total sales: " + totalSales + "\n->Commission: "
				+ calculateCommission());

	}

}
