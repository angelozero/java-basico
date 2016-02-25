package br.com.angeloakm.poo.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Livro> listLivros;
	ArrayList<Cliente> listClientes;
	BibliotecaAtividade tarefas;

	public Biblioteca() {
		this.listClientes = new ArrayList<Cliente>();
		this.listLivros = new ArrayList<Livro>();
		this.tarefas = new BibliotecaAtividade();
	}

}
