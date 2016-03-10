package br.com.angeloakm.heranca;

public class Veiculo {

	protected String nome;
	protected String marca;
	protected String modelo;

	public Veiculo(String marca){
		this.marca = marca;
	}
	
	public void buzinar() {

		System.out.println("Som não identificado");
	}
	
	public void exibeDados(){
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + marca);
		System.out.println("Nome: " + modelo);
	}

	

}
