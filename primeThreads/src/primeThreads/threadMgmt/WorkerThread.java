
package primeThreads.threadMgmt;

import primeThreads.store.ResultInterface;

import primeThreads.util.FileProcessorInterface;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class WorkerThread implements Runnable {

	private FileProcessorInterface fileProcessor = null;
	private ResultInterface result = null;
	private IsPrime isPrime = null;

	/**
	 * this is parameterized constructor
	 * 
	 * @param fileProcessor
	 * @param result
	 * @param isPrime
	 */
	public WorkerThread(FileProcessorInterface fileProcessor, ResultInterface result, IsPrime isPrime) {
		Logger.writeMessage("WorkerThread constructor is called !", DebugLevel.CONSTRUCTOR);

		this.fileProcessor = fileProcessor;
		this.result = result;
		this.isPrime = isPrime;

	}

	/**
	 * Run method executed by threads
	 */
	public void run() {
		Logger.writeMessage("Run method is called here  ", DebugLevel.RUN_METHOD_CALL);
		String currentLine = null;
		while ((currentLine = fileProcessor.readLineFromFile()) != null) {

			int number;
			try {
				number = Integer.parseInt(currentLine);
			} catch (NumberFormatException e) {
				System.err.println("Invalid input format. Expected an integer");
				continue;
			}

			if (isPrime.isPrime(number)) {

				result.insertIntoList(number);
			}
			//

		}

	}

}