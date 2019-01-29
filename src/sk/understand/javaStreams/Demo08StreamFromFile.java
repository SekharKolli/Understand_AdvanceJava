/*
 * Purpose : Demo creating a stream from a file (AirlineList.txt), sorting it and displaying it
 * 
 * Link : https://www.youtube.com/watch?v=t1-YZ6bF-g0
 * 
 * all Stream are of the format
 * "source + intermediateOperation + intermediateOperation + .... + intermediateOperation + TerminalOperation"
 * 
 * Date: 29-January-2019
 */

package sk.understand.javaStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo08StreamFromFile {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");
		
		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_AdvancedJava\\src\\sk\\understand\\javaStreams\\AirlineList.txt";

		/* Read from Airlines.txt and sort  */
		Stream<String> canadianAirlines = Files.lines(Paths.get(filePath));
		
		canadianAirlines
			.sorted()
			.filter(x -> x.length() > 14)
			.forEach(System.out::println);
		
		canadianAirlines.close(); // close the stream and release resources
		
		
		
		System.out.println("-----Main Stops-----");

	}

}
