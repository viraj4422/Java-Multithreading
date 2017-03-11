/**
 * Author: Viraj Nimbalkar
 * Design Patterns Assignment 2
 */
package primeThreads.driver;

import primeThreads.store.ResultInterface;
import primeThreads.store.Results;
import primeThreads.store.StdoutDisplayInterface;
import primeThreads.threadMgmt.CreateWorkers;
import primeThreads.util.FileProcessor;
import primeThreads.util.FileProcessorInterface;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;

public class Driver {

	public static void main(String args[]) {

		if (args.length != 3) {
			System.err.println("Please provide three inputs...\n1.File Name \n 2.Number of Threads\n 3.DEBUG_VALUE");
			System.exit(0);
		}

		int numThreads = 0;

		try {
			numThreads = Integer.parseInt(args[1]);
		} catch (NumberFormatException execption) {
			System.err.println("Number of threads should be integer!!");
			System.exit(0);
		}

		int debugValue = 0;

		try {
			debugValue = Integer.parseInt(args[2]);
			Logger.setDebugValue(debugValue);
		} catch (NumberFormatException execption) {
			System.err.println("Debug Value should be integer!!");
			System.exit(0);
		}

		if (numThreads > 5 || numThreads < 1) {
			System.err.println("Please provide number of threads in between 1 and 5");
			System.exit(0);
		}

		if (debugValue > 4 || debugValue < 0) {
			System.err.println("Please provide DEBUG_VALUE between 0 and 4");
			System.exit(0);
		}

		FileProcessorInterface fileProcessor = new FileProcessor(args[0]);
		ResultInterface result = new Results();
		IsPrime isPrime = new IsPrime();

		CreateWorkers workerOne = new CreateWorkers(fileProcessor, result, isPrime);
		workerOne.startWorkers(numThreads);
		((StdoutDisplayInterface) result).writeSumToScreen();

		// workerOne.startWorkers(numThreads);

	} // end main(...)

} // end public class Driver
