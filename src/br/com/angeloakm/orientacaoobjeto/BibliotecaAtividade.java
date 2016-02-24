package br.com.angeloakm.orientacaoobjeto;

import java.util.ArrayList;

public class BibliotecaAtividade {

	public ArrayList<String> nomeAutor(Cliente cliente) {

		ArrayList<String> nomesAutores = new ArrayList<String>();

		if (cliente.listLivros.size() > 0) {

			for (int i = 0; i < cliente.listLivros.size(); i++) {
				nomesAutores.add(nomeAutor(cliente.listLivros.get(i)));
			}
		}
		return nomesAutores;
	}

	private String nomeAutor(Livro livro) {
		if (livro != null)
			return livro.getAutor();
		else
			return "Autor não encontrado";
	}
}
