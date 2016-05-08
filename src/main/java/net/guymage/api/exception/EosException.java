package net.guymage.api.exception;

/**
 * Exception dédiée à EOS
 *
 * @author guymage
 *
 */
public class EosException extends RuntimeException {

	private static final long serialVersionUID = -1090238911752488066L;

	public EosException() {
	}

	public EosException(String message) {
		super(message);
	}

	public EosException(Throwable cause) {
		super(cause);
	}

	public EosException(String message, Throwable cause) {
		super(message, cause);
	}

}
