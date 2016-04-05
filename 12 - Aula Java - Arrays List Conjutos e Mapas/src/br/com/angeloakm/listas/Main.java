package br.com.angeloakm.listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		/* --- ArrayList --- */
		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(1);
		lista.add(10);
		lista.add(20);

		lista.add(0, 123456);

		Integer retorno = lista.get(3);
		System.out.println(retorno);
		System.out.println();

		for (Integer integer : lista) {
			System.out.println(integer);
		}
		System.out.println();

		/* --- Array Multidimensonal --- */
		int[][] array = new int[4][4];

		// array[0][0] = 10;
		// array[0][1] = 5;
		// array[0][2] = 3;
		// array[0][3] = 2;
		// array[1][0] = 1;
		// array[1][1] = 188;
		// array[1][2] = 13;
		// array[1][3] = 122;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		
		/* --- Hash Map --- */
		System.out.println();

		Map m = new HashMap();
		Livro l1 = new Livro();
		l1.setNome("Angelo. The Boss");
		l1.setNumero(1);

		Livro l2 = new Livro();
		l2.setNome("Angelo. The Real Boss");
		l2.setNumero(2);

		m.put(0, l1);
		m.put(1, l2);

		for (int i = 0; i < m.size(); i++) {
			System.out.println();
			Livro ret = (Livro) m.get(i);
			System.out.println(ret.nome);
			System.out.println(ret.numero);
			System.out.println();
		}

	}
}
