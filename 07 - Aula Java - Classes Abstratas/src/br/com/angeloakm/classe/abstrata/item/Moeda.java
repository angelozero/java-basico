package br.com.angeloakm.classe.abstrata.item;

import br.com.angeloakm.classe.abstrata.item.impl.Item;

public class Moeda extends Item{
	
	@Override
	public void pegar() {
		System.out.println("Pegou MOEDA");
		
	}

}
