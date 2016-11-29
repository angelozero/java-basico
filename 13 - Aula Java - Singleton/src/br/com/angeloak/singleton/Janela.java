package br.com.angeloak.singleton;

public final class Janela {

	private static final Janela INSTANCE = new Janela();
	private static final String TESTE = "Ola Singleton";
	public static final String SINGLETON = "Singleton ok";

	private Janela() {

	}

	public static Janela getInstance() {
		return INSTANCE;
	}

	public static void abrir() {
		System.out.println("Abriu a janela");
	}

	public static void fechar() {
		System.out.println("Fechou a janela");
	}

}
