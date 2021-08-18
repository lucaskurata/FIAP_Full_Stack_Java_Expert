package br.com.fiap.investimento.exceptions;

public class DadoDuplicadoException extends Exception {

	public DadoDuplicadoException() {
	}

	public DadoDuplicadoException(String message) {
		super(message);
	}

	public DadoDuplicadoException(Throwable cause) {
		super(cause);
	}

	public DadoDuplicadoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadoDuplicadoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
