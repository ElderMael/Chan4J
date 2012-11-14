package org.mael.chan4j;

public class FourChanException extends RuntimeException {

	private static final long serialVersionUID = -3779620370520847998L;

	public FourChanException() {
		super();
	}

	public FourChanException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FourChanException(String message, Throwable cause) {
		super(message, cause);
	}

	public FourChanException(String message) {
		super(message);
	}

	public FourChanException(Throwable cause) {
		super(cause);
	}

}
