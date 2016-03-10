package br.com.angeloakm.polimorfismo;

public class Cachorro extends Animal {

	public void emitirSom() {
		System.out.println("Au Auuuu");
	}

	// Metodo especifico de cachorro
	public void morder() {
		System.out.println("Nhac !");
	}
}
