package exercise2;

public class HourlyEmployeeTest {
   public static void main(String[] args) {
      
	   HourlyEmployee employee = null;
	   
	   // instantiate HourlyEmployee object
     try {
	   employee = new HourlyEmployee(
         "Sue", "Jones", "222-22-2222", 100, 14.06);       
     }
     
     catch (IllegalArgumentException ex)
     {
    	 System.out.println("ERROR : " + ex.getMessage());
     }
      // get commission employee data
      System.out.println("Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Hour worked is", 
         employee.getHourWorked());
      System.out.printf("%s %.2f%n", "Wage is",
         employee.getWage());
      // Handling exceptions
      try {
          employee.setHourWorked(70);  
          employee.setWage(15.40);
      }
      catch (IllegalArgumentException ex)
      {
     	 System.out.println("ERROR : " + ex.getMessage());
      }
      
      System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee);
      
      System.out.printf("%n%s: %s", "Earnings: ", employee.earnings());
   } // end main()
} // end class

