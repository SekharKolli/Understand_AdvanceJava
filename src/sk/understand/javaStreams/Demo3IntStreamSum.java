/*
 * Purpose : Learn about IntStream, .rangeclosed() .sum() terminal operation and returning this value for printing in System.out.println
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.util.stream.IntStream;

public class Demo3IntStreamSum {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		/* 3. Integer Stream with sum */
		
		System.out.println("The sum of 10+11+12+13+14+15 = "+
							IntStream
								.rangeClosed(10, 15)		// Returns a sequential ordered int from 10 to 15 (inclusive)
								.sum()						// terminal operation which returns the sum of this range
						  );

		System.out.println("-----Main  Stops-----");

	}

}
