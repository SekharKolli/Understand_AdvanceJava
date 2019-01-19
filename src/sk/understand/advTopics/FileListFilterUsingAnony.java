package sk.understand.advTopics;
/**
 * Purpose : Reallife demo of anonymous classes. 
 * Read the contents of a directory, using the accept method in FileNameFilter accept items which endswith a certain extension
 *
 * Date: 30-December-2018
 */

import java.io.File;
import java.io.FilenameFilter;

public class FileListFilterUsingAnony {

	public static void main(String[] args) {

		File fromDir = new File("C:\\Users\\SekharMaster\\Downloads");

		// generating a direList using File's inbuilt method list using filenamefilter
		String[] dirList = fromDir.list(new FilenameFilter() { // Here an anonymous class is getting generated
			@Override
			public boolean accept(File dir, String name) { return name.endsWith("pdf"); }
		});

		// print the list of collected names
		for (String name : dirList) {
			System.out.println(name);
		}

	}

}
