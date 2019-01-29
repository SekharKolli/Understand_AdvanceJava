/*
 * Purpose : Learn about IntStream, we use skip() intermediate function
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.util.stream.IntStream;

public class Demo02IntStreamWithSkip {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		/* 2. Integer Stream with skip and forEach lambda */
		IntStream
				.range(10, 25) 	// Returns a sequential order of integers from 10 to 24 incrementing by one
				.skip(10) 		// Returns a stream after skipping first n elements 
				.forEach(x -> System.out.print(x+" ~ "));	// Terminal Operation

		System.out.println("\n-----Main  Stops-----");

	}

}
