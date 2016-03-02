package br.com.angeloakm.construtores;

public class Quadrado {
	private double lado1;
	private double lado2;

	public Quadrado(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getArea() {
		return lado1 * lado2;
	}
}
