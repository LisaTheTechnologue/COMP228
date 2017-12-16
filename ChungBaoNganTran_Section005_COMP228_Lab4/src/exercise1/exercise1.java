package exercise1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class exercise1 {
	/*
	 * Write a program that reads in a series of first names and eliminates the
	 * duplicates by storing them in a set. Allow the user search for first name.
	 */
	public static void main(String[] args) {
		String[] fnames = { "Smith", "Bob", "Jane", "Lisa", "Bob", "Jolean" };
		List<String> list = Arrays.asList(fnames);
		Collections.sort(list); // sort the ArrayList
		printNonDuplicates(list);
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:"); // prompt for user input
		String input = scanner.nextLine();
		printSearchResults(list, input);
	}

	private static void printNonDuplicates(Collection<String> values) {
		// create a HashSet
		Set<String> set = new HashSet<>(values);

		System.out.printf("%n Non-duplicates are: ");

		for (String value : set) {
			System.out.printf("%s ", value);
		}
	}

	// perform search and display result
	private static void printSearchResults(List<String> list, String key) {
		System.out.printf("%nSearching for: %s%n", key);
		int result = Collections.binarySearch(list, key);

		if (result >= 0) {
			System.out.printf("Found at index %d%n", result);
		} else {
			System.out.printf("Not Found (%d)%n", result);
		}
	}
}
