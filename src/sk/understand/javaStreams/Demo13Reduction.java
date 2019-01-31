/*
 * Purpose : Demos using the reduction function
 * 
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Streams are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo13Reduction {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");

		double dTotal = Stream.of(8.2, 6.7, 7.5, 6.2, 9.5)
							  .reduce(0.0, (Double a, Double b) -> a + b);		// We have to define a sum, where 'a' behaves like the aggregator
		System.out.println("Total of Doubles : "+dTotal);
		
		
		
		
		int iTotal = IntStream.of(1,2,3,4,5,6,7)		// intStream has an inbuilt function to reduce called sum 
						   .sum();						// Builtin function to return sum
		System.out.println("Total of Integers : "+ iTotal);
		
		
		
		

		System.out.println("-----Main Stops-----");

	}

}
