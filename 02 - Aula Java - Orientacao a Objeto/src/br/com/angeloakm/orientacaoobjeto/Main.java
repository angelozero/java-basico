package br.com.angeloakm.orientacaoobjeto;

import java.util.ArrayList;

/**
 * 
 * @author angelo
 * @SOBRE Aula sobre orientação a objetos. Neste exemplo temos uma biblioteca
 *        que executa tarefas de consulta de livros atraves do cliente que o
 *        possui.
 */
public class Main {
	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();

		Livro livro1 = new Livro();
		livro1.setAutor("Kojima");
		livro1.setNomeLivro("Metal Gear Solid");
		livro1.setQtdPaginas(150);
		livro1.setTema("Espionagem");

		Livro livro2 = new Livro();
		livro2.setAutor("Alex Ross");
		livro2.setNomeLivro("Batman");
		livro2.setQtdPaginas(30);
		livro2.setTema("Aventura");

		Cliente cliente1 = new Cliente();
		cliente1.nome = "Angelo";
		cliente1.sexo = 'M';

		cliente1.listLivros.add(livro1);
		cliente1.listLivros.add(livro2);

		biblioteca.listLivros.add(livro1);
		biblioteca.listLivros.add(livro2);

		biblioteca.listClientes.add(cliente1);

		ArrayList<String> nomeAutores = biblioteca.tarefas.nomeAutor(cliente1);

		for (int i = 0; i < nomeAutores.size(); i++) {
			int j = i;
			System.out.println("Autor: " + (j + 1) + " " + nomeAutores.get(i));
		}
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("Quantidade de livros na biblioteca: " + biblioteca.listLivros.size());

	}
}
