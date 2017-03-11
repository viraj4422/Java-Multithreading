
package primeThreads.util;

public class Logger {

	public static enum DebugLevel {
		OUTPUT, DATA_STRUCTURE_CONTENTS, ENTRY_DISPLAY, RUN_METHOD_CALL, CONSTRUCTOR
	};

	private static DebugLevel debugLevel;

	/**
	 * set debug value as per the debugValue
	 * 
	 * @param levelIn
	 */
	public static void setDebugValue(int levelIn) {
		switch (levelIn) {
		case 0:
			debugLevel = DebugLevel.OUTPUT;
			break;
		case 1:
			debugLevel = DebugLevel.DATA_STRUCTURE_CONTENTS;
			break;
		case 2:
			debugLevel = DebugLevel.ENTRY_DISPLAY;
			break;
		case 3:
			debugLevel = DebugLevel.RUN_METHOD_CALL;
			break;
		case 4:
			debugLevel = DebugLevel.CONSTRUCTOR;
			break;
		}
	}

	public static void setDebugValue(DebugLevel levelIn) {
		debugLevel = levelIn;
	}

	/**
	 * function which prints message as per debugValue
	 * 
	 * @param message
	 * @param levelIn
	 */
	// @return None
	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == debugLevel)
			System.out.println(message);
	}

	public String toString() {
		return "Debug Level is " + debugLevel;
	}
}
