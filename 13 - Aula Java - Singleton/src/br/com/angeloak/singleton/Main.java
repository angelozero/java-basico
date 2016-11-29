package br.com.angeloak.singleton;

public class Main {
	public static void main(String[] args) {
		
		
		
		Janela teste = Janela.getInstance();
		
		Janela.abrir();
		Janela.fechar();
		
		String singleton = Janela.SINGLETON;
		
	}
}
