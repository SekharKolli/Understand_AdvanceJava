/*
 * Purpose : Learn about IntStream
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * Date: 28-January-2019
 */

package sk.understand.javaStreams;

import java.util.stream.IntStream;

public class DemoIntStream {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		IntStream
			.range(1, 10)
			.forEach(System.out::print);

		System.out.println("\n-----Main  Stops-----");

	}

}
