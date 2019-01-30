/*
 * Purpose : Demo creating a stream from a file (data.txt) and return a line count that matches a criteria 
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

public class Demo10StreamFromCSVFilter {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");
		
		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_AdvancedJava\\src\\sk\\understand\\javaStreams\\data.txt";

		/* Stream rows from CSV file and count  */
		Stream<String> lines = Files.lines(Paths.get(filePath));
		
		long linesInFile = lines
							.map(x -> x.split(","))
							.filter(x -> x.length >=4)
							.count();
		System.out.println("Number of lines in file having >=4 columns is : "+linesInFile);
		
		lines.close(); // Close the baseStream
		
		System.out.println("-----Main Stops-----");

	}

}
