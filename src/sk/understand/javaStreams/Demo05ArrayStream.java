/*
 * Purpose : Learn about Arrays.stream() along with the .map() .average() functions
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.util.Arrays;

public class Demo05ArrayStream {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		/* Generate a stream from list of strings */
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		Arrays.stream(months)	// Same as Stream.of(months)
//			.filter(x -> x.startsWith("M"))		// filters items starting with M
			.filter(x -> x.matches(".*ber"))	// Matches the regex expression
			.sorted()
			.forEach(System.out::println);

	}

}
