package model.exceptions;

// public class DomainException extends RuntimeException --> NÃO OBRIGA O TRATAMENTO, MAS DEVE SER TRATADO PARA EVITAR QUEBRAS.
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
