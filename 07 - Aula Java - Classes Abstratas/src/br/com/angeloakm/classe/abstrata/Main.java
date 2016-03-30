package br.com.angeloakm.classe.abstrata;

import br.com.angeloakm.classe.abstrata.item.Cogumelo;
import br.com.angeloakm.classe.abstrata.item.Diamante;
import br.com.angeloakm.classe.abstrata.item.Moeda;

public class Main {
	public static void main(String[] args) {

		Moeda m = new Moeda();
		m.pegar();

		Diamante d = new Diamante();
		d.pegar();

		Cogumelo c = new Cogumelo();
		c.pegar();
	}
}
