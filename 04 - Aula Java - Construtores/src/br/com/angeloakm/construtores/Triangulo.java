package br.com.angeloakm.construtores;

public class Triangulo {

	private double largura;
	private double altura;

	public Triangulo() {
		this.altura = 2;
		this.largura = 2;
	}

	public Triangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double getArea() {
		return altura * largura;
	}

}
