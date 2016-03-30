package br.com.angeloakm.interfaces;

public class Main {

	public static void main(String[] args) {

		String user = "angelo";
		String pswrd = "123";

		Autenticador login = obterAutenticadorPorConexaoDB();

		if (login.autenticar(user, pswrd))
			System.out.println("Usuario autenticado");
		else
			System.out.println("Usuario nao autenticado");
	}

	public static Autenticador obterAutenticadorPorArquivo() {
		return new FileAutenticador();
	}

	public static Autenticador obterAutenticadorPorConexaoDB() {
		return new DBAutenticador();
	}

}
