
package primeThreads.store;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class Results implements StdoutDisplayInterface, ResultInterface {

	List<Integer> primeNumberList = null;

	/**
	 * constructor which creates a new array list
	 */
	public Results() {

		Logger.writeMessage("Results constructor is called !", DebugLevel.CONSTRUCTOR);

		primeNumberList = new CopyOnWriteArrayList<Integer>();
	}

	/**
	 * Method that calculates the sum of all elements
	 */
	public void writeSumToScreen() {

		int sum = 0;

		for (int i = 0; i < primeNumberList.size(); i++) {

			sum = sum + primeNumberList.get(i);

		}
		Logger.writeMessage("The sum of all the prime numbers is: " + sum, DebugLevel.OUTPUT);
		Logger.writeMessage("Data Structure contents:   " + toString(), DebugLevel.DATA_STRUCTURE_CONTENTS);

	}

	/**
	 * insert into arraylist everytime we get new prime number from the file
	 */
	@Override
	public void insertIntoList(int number) {
		Logger.writeMessage(" " + number + "  is added to data structure", DebugLevel.ENTRY_DISPLAY);

		primeNumberList.add(number);

	}

	/**
	 * This methods returns the elements in array list string format
	 */
	@Override
	public String toString() {
		return " " + primeNumberList;
	}
}
