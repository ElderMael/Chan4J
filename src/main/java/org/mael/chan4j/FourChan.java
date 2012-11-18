package org.mael.chan4j;

public class FourChan {

	public static FourChanBoard fromBoard(String boardName) {
		return new FourChanBoard(boardName);
	}

	static String getProtocolPrefix(boolean useHttps) {
		return (useHttps) ? "https" : "http";
	}

}
