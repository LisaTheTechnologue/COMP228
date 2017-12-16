package exercise3;

public class Overload {
	 /* Write a Java class that implements a set of three overloaded static methods.
	 * The methods should have different set of parameters and perform similar
	 * functionalities. Call the methods within main method and display the results.
	 */
	public static int mutliply (int first,int second,int third) {
		return first*second*third;
	}
	public static int mutliply (int first,int second) {
		return first*second;
	}
	public static int mutliply (int first) {
		return first*100;
	}
}
