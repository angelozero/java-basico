package br.com.angeloakm.orientacaoobjeto;

import java.util.ArrayList;

public class Cliente {

	public Cliente() {
		this.listLivros = new ArrayList<Livro>();
	}

	String nome;
	char sexo;
	ArrayList<Livro> listLivros;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Livro> getListLivros() {
		return listLivros;
	}

	public void setListLivros(ArrayList<Livro> listLivros) {
		this.listLivros = listLivros;
	}

}
