package br.com.angeloakm.polimorfismo;

public class Main {
	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		c.emitirSom();

		Gato g = new Gato();
		g.emitirSom();

		// Polimorfismo
		Animal cao = new Cachorro();
		cao.emitirSom();
		// cao.morder();

		if (cao instanceof Cachorro) {
			Cachorro ca = (Cachorro) cao;
			ca.morder();
		}

	}
}
