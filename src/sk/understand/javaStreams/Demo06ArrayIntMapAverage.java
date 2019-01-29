/*
 * Purpose : Learn about .map() .average() and generating an int array stream using Arrays.stream() 
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.util.Arrays;

public class Demo06ArrayIntMapAverage {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		System.out.println("-----Using Map Function-----");
		Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				.map(x -> x * x) // performs a uniary operation or operation
				.forEach(System.out::println);

		System.out.println("-----Getting an average-----");

		/* 6. average of square of int array */
		Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				.map(x -> x * 2)
				.average() // Gets the average of the stream and returns it
				.ifPresent(System.out::println); // Prints if a computed value is present

		System.out.println("-----Main Stops-----");

	}

}
