package br.com.angeloakm.main;

import br.com.angeloakm.autoboxing.Valor;
import br.com.angeloakm.enums.Sexo;

public class Main {

	public static void main(String[] args) {

		/* -------- Enums -------- */
		
		Sexo[] array = Sexo.values();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("");
		System.out.println(Sexo.F.getSexoDesc() + "\n" + Sexo.M.getSexoDesc() + "\n" + Sexo.J.getSexoNum());

		/* -------- Wrappers -------- */
		
		int i = 10;
		
		Integer integer1 = new  Integer(i);
		Integer intefer2 = new Integer("10");
		
		/* -------- Autoboxing -------- */
		
		Valor valor = new Valor();
		valor.setVal(new Integer("10000"));
		
		int retorno = valor.getVal();
		
		System.out.println("");
		System.out.println(retorno);
		
	}
}
