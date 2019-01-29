/*
 * Purpose : Creating a .stream() from a List collection
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.util.Arrays;
import java.util.List;

public class Demo07ListStream {

	public static void main(String[] args) {

		System.out.println("-----Main Starts-----");

		/* 7. Stream from List, filter and print */
		List<String> planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Pluto", "Jupiter", "Saturn", "Uranus", "Neptune");
		planets
			.stream()							// Returns a sequential Stream with this collection as its source
			.map(String::toLowerCase)			// Changes each element to lowercase
			.filter(x -> x.startsWith("m"))		// filter elements that starts with "m"
			.forEach(System.out::println);		// print the values

		System.out.println("-----Main Stops-----");

	}

}
