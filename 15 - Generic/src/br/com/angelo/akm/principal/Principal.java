package br.com.angelo.akm.principal;

import br.com.angelo.akm.generic.ObjGeneric;
import br.com.angelo.akm.obj.Pessoa;

public class Principal {

	public static void main(String[] args) {

		ObjGeneric<String> objString = new ObjGeneric<>();
		ObjGeneric<Integer> objInt = new ObjGeneric<>();
		ObjGeneric<Pessoa> objPessoa = new ObjGeneric<>();

		objString.setObjGenerico("String teste");
		objInt.setObjGenerico(1);
		objPessoa.setObjGenerico(new Pessoa("Angelo"));

		System.out.println(objString.getObjGenerico());
		System.out.println(objInt.getObjGenerico());
		System.out.println(objPessoa.getObjGenerico().getNome());

	}
}
