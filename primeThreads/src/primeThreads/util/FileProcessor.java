package primeThreads.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import primeThreads.util.Logger.DebugLevel;

/**
 * File operations Returns one line of the file as a String at a time.
 * 
 * @author Viraj
 *
 */
public class FileProcessor implements FileProcessorInterface {
	private String fileName = null;
	private FileReader fileReader = null;
	private BufferedReader bufferedReader = null;

	public FileProcessor(String inputFileName) {
		fileName = inputFileName;
		Logger.writeMessage("FileProcessor constructor is called !", DebugLevel.CONSTRUCTOR);

	}

	/**
	 * Initialize the file reading and handle file not found error
	 */
	public void initliazeFile() {
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.err.println("Unfortunately file" + " '" + fileName + "'" + "could not be opened !!");
			System.exit(1);
		}
	}

	/**
	 * read one line from a file and return it as a string
	 * 
	 * @return line
	 */
	public synchronized String readLineFromFile() {

		String line = null;
		try {
			line = bufferedReader.readLine();

		} catch (IOException ex) {
			System.err.println("Error reading file '" + fileName + "'");
			System.exit(1);
		}
		return line;
	}

}
