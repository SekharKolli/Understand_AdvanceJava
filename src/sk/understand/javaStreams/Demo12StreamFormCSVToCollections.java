/*
 * Purpose : Demo reading a CSV file (data.txt) using streams and save this into a Map<k,v> collection 
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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo12StreamFormCSVToCollections {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");

		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_AdvancedJava\\src\\sk\\understand\\javaStreams\\data.txt";

		System.out.println("-----Mapping to Map<String, Double>-----");
		
		/* Stream rows from CSV file and add to Map<k,v>*/
		Map<String, Double> kvPairs = new HashMap<>(); // This is where we'll be storing the key, value pairs	
		Stream<String> inpLines = Files.lines(Paths.get(filePath));

		kvPairs = inpLines
			.map(x -> x.split(","))
			.filter(x -> x.length >= 4)		// Ensure there is a 4th column to add as value, else we'll get exception
			.collect(Collectors.toMap(x -> x[1], x -> Double.parseDouble(x[3])));	// Just the doubleValue
//			.forEach(x -> System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]+" "));

		inpLines.close(); // Close the baseStream
		
		for (String key : kvPairs.keySet()) { // Print values 
			System.out.println(key+" "+kvPairs.get(key));
		}
		
		/* ---------------------------------------------------------------------- */

		System.out.println("-----Mapping to Map<String, String>-----");
		
		Map<String, String> fullMap = new HashMap<>(); // This is where we'll be storing the key, value pairs	
		Stream<String> fileLines = Files.lines(Paths.get(filePath));
		
		fullMap = fileLines
				.map(x -> x.split(","))
				.filter(x -> x.length >= 4)		// Ensure there is a 4th column to add as value, else we'll get exception
				.collect(Collectors.toMap(x -> x[1], x -> "["+x[0]+"|"+x[1]+"|"+x[2]+"|"+x[3]+"]"));	// Just the doubleValue
//			.forEach(x -> System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]+" "));
		
		fileLines.close(); // Close the baseStream
		
		for (String key : fullMap.keySet()) { // Print values 
			System.out.println(key+" maps to "+fullMap.get(key));
		}

		System.out.println("-----Main Stops-----");

	}

}
