package com.tableSchema.common.exception;

public class ApFormatException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApFormatException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ApFormatException(final String message) {
		super(message);
	}

}
