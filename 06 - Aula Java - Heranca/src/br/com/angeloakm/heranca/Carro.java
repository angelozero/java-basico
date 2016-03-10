package br.com.angeloakm.heranca;

public class Carro extends Veiculo {

	public Carro(String marca) {
		super(setMarca(marca));
	}

	private boolean numPortas;

	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Tem quatro portas? " + numPortas);
	}

	public void buzinar() {
		System.out.println("Bi Bi");
	}

	private static String setMarca(String marca) {
		if (marca.isEmpty())
			return "";
		else
			return marca;
	}

}
