package ink.codflow.sync.exception;

import java.io.IOException;

public class FileException extends IOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5866437127076887560L;

	public FileException() {
		super();
	}

	public FileException(Throwable e) {
		super(e);
	}
	
	public FileException(String msg) {
		super(msg);
	}

	public FileException(String msg, Throwable e) {
		super(msg, e);
	}
}
