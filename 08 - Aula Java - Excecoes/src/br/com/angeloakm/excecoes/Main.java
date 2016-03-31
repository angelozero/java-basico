package br.com.angeloakm.excecoes;

public class Main {
	public static void main(String[] args) {

		gerador();
		System.out.println("Fim do Programa");

	}

	public static void gerador() {
		try {
			gerarErro();
		} catch (TesteException e) {
			System.out.println("Erro " + e.getCode());
		} finally {
			System.out.println("Fim do fluxo");
		}
	}

	private static void gerarErro() throws TesteException {
		throw new TesteException(100);
	}
}
