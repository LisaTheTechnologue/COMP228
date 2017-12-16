package exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exercise2 {
	/*Write a program that determines and prints the number of duplicate words in a sentence.  
	 * Treat uppercase and lowercase letters the same. Ignore punctuation.*/

	private static Scanner scanner;

	public static void main(String[] args) {
	      // create HashMap to store String keys and Integer values
	      Map<String, Integer> myMap = new HashMap<>();            

	      createMap(myMap); // create map based on user input
	      displayMap(myMap); // display map content
	   } 

	   // create map from user input
	   private static void createMap(Map<String, Integer> map) {
	      scanner = new Scanner(System.in);
	      System.out.println("Enter a string:"); // prompt for user input
	      String input = scanner.nextLine();

	      // tokenize the input
	      String[] tokens = input.split(" ");
	               
	      // processing input text 
	      for (String token : tokens) {
	         String word = token.toLowerCase(); // get lowercase word
	                  
	         // if the map contains the word
	         if (map.containsKey(word)) { // is word in map?
	            int count = map.get(word); // get current count
	            map.put(word, count + 1); // increment count   
	         } 
	         else {
	            map.put(word, 1); // add new word with a count of 1 to map
	         } 
	      } 
	   } 
	   
	   // display map content
	   private static void displayMap(Map<String, Integer> map) {
	      Set<String> keys = map.keySet(); // get keys

	      // sort keys
	      TreeSet<String> sortedKeys = new TreeSet<>(keys);

	      System.out.printf("%nMap contains:%nKey\t\tValue%n");

	      // generate output for each key in map
	      for (String key : sortedKeys) {
	         System.out.printf("%-10s%10s%n", key, map.get(key));
	      }
	      
	   } 
}
