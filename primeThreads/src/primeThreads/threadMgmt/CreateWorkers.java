
package primeThreads.threadMgmt;

import primeThreads.store.ResultInterface;

import primeThreads.util.FileProcessorInterface;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class CreateWorkers {

	private FileProcessorInterface fileProcessor = null;
	private ResultInterface result = null;
	private IsPrime isPrime = null;

	/**
	 * This is a parameterized constructor
	 * 
	 * @param fileProcessor
	 * @param result
	 * @param isPrime
	 */
	public CreateWorkers(FileProcessorInterface fileProcessor, ResultInterface result, IsPrime isPrime) {

		Logger.writeMessage("CreateWorkers constructor is called !", DebugLevel.CONSTRUCTOR);

		this.fileProcessor = fileProcessor;
		this.result = result;
		this.isPrime = isPrime;

	}

	/**
	 * create threads for reading the file and join them
	 * 
	 * @param numberOfThreads
	 */
	public void startWorkers(int numberOfThreads) {
		Thread workers[] = new Thread[numberOfThreads];
		fileProcessor.initliazeFile();
		for (int i = 0; i < numberOfThreads; i++) {
			WorkerThread workerThread = new WorkerThread(fileProcessor, result, isPrime);
			workers[i] = new Thread(workerThread);
			workers[i].start();
		}

		for (int i = 0; i < numberOfThreads; i++) {
			try {
				workers[i].join();
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());

			}

		}

	}
}
