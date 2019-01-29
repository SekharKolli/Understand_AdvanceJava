/*
 * Purpose : Learn about Stream.of() which can be used to generate a stream from strings
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.util.stream.Stream;

public class Demo04StreamOf {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		/* Generate a stream from list of strings */
		Stream.of("Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.")
				.forEach(System.out::print);

		System.out.println("\n-----After sorting -----");
		Stream.of("Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.")
			.sorted()
			.forEach(System.out::print);

		/* 4. Stream.of() & sorted & findFirst */
		System.out.println("\n-----After sorting and finding first and if present printing -----");
		Stream.of("Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.")
				.sorted()				// Sorts the stream
				.findFirst()			// Picks up the first element
				.ifPresent(System.out::println);	//work on the element (or null) left in the stream 

		System.out.println("-----Main  Stops-----");

	}

}
