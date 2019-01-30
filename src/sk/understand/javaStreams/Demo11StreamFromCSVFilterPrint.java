/*
 * Purpose : Demo reading a CSV file (data.txt) using streams and displaying data on screen 
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

public class Demo11StreamFromCSVFilterPrint {

	public static void main(String[] args) throws IOException {

		System.out.println("-----Main Starts-----");

		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_AdvancedJava\\src\\sk\\understand\\javaStreams\\data.txt";

		/* Stream rows from CSV file and count */
		Stream<String> lines = Files.lines(Paths.get(filePath));

		lines
			.map(x -> x.split(","))
			.filter(x -> x.length >= 4)
			.forEach(x -> System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]+" "));

		lines.close(); // Close the baseStream

		System.out.println("-----Main Stops-----");

	}

}
