/*
 * Purpose : Learn about IntStream
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format 
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation" 
 * 
 * Date: 28-January-2019
 */

package sk.understand.javaStreams;

import java.util.stream.IntStream;

public class Demo01IntStream {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		/* 1. Integer Stream */
		IntStream
			.range(5, 10) // Display numbers from 5 to 9
			.forEach(System.out::print);

		System.out.println("\n-----Main  Stops-----");

	}

}
