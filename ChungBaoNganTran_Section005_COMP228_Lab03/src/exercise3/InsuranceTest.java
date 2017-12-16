package exercise3;

public class InsuranceTest {

	public static void main(String[] args) {
		Home ins1 = new Home("1E20E", "Jackson Wang", new Address(15, "Bloor Street", "HongKong", "China", "8E8R5E"),
				new Date(03, 26, 2014), 2500, 10);

		Auto ins2 = new Auto("3482SF", "Mark Tuan", new Address(16, "Yonge Street", "Las Vegas", "America", "8E8R5E"),
				new Date(04, 10, 2014), "Furious", "Ferarie", 10);
		
		System.out.println(ins1);
		System.out.println();
		System.out.println(ins2);
	}

}
