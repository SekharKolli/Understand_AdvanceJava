/*
 * Purpose : Demo creating a stream from a file (AirlineList.txt) and put it in a list
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
import java.util.List;
import java.util.stream.Collectors;

public class Demo09StreamFromFiletoList {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");
		
		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_AdvancedJava\\src\\sk\\understand\\javaStreams\\AirlineList.txt";

		/* Read from Airlines.txt, filter and collect it to be added in a list collection  */
		List<String> airlineList = Files.lines(Paths.get(filePath))
									.map(String::toUpperCase)	// lambda expression. same as .map(i -> i.toUpperCase())
									.filter(s -> s.contains("AIR"))
									.collect(Collectors.toList()); // collect the filtered items into a collector
		
		airlineList.forEach(x -> System.out.println(x)); // Printing out the list using the forEach method and use lamda expressions
		
		
		System.out.println("-----Main Stops-----");

	}

}
