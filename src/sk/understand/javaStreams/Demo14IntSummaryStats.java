/*
 * Purpose : Demos getting IntSummaryStatistics for IntStream
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
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Demo14IntSummaryStats {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");

		IntSummaryStatistics summary = IntStream.of(13,43,65,7,845,4,34,6,87,8,3,42,6,84,2)
												.summaryStatistics();
		
		System.out.println(summary);

		System.out.println("-----Main Stops-----");

	}

}
