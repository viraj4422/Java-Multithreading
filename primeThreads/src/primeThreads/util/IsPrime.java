
package primeThreads.util;

public class IsPrime {
	/**
	 * check if given number is prime or not(not even, for the purpose of this
	 * assignment)
	 * 
	 * @param number
	 * @return boolean
	 */
	public boolean isPrime(int number) {

		if (number % 2 == 0)
			return false;
		else
			return true;

	}

}
