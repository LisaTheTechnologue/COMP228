package exercise1;

public class MortgageTest {

	public static void main(String[] args) {
		Mortgage houseInstallment = new HouseMortgage(1002,"Jackie Chan",new Date(12,01,1986),new Address(675," Mil Ave","HuangRen","HongKong","W2E 4D2"), 89000, 0.3, 0.9, 0.15);
		Mortgage businessInstallment = new BusinessMortgage(2003,"Mefusa Lave",new Date(12,01,1986),new Address(1239,"Bloors Street","Scarborough","Toronto","M2E 8T7"), 16000, 0.5, 0.1);
		System.out.println(houseInstallment);
		System.out.println(businessInstallment);
	}

}
