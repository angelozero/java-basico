package br.com.angeloakm.excecoes;

public class TesteException extends Exception {

	public TesteException(int code) {
		this.code = code;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int code;

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

}
