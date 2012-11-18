package org.mael.chan4j;

import org.mael.chan4j.utils.Constants;

public class FourChan {

	public static FourChanBoard fromBoard(String boardName) {
		return new FourChanBoard(boardName);
	}

	public static String getProtocolPrefix(boolean useHttps) {
		return (useHttps) ? Constants.HTTPS_PROTOCOL_STRING
				: Constants.HTTP_PROTOCOL_STRING;
	}

}
