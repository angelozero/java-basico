package br.com.angeloakm.heranca;

/**
 * 
 * @author angelo
 * @SOBRE Herança da classe Veiculo. Veiculo contem 3 atributos dos quais apenas
 *        seus filhos podem ter acesso. Para isso usa-se protected. A classe
 *        veiculo tambem contem metodos pre definidos dos quais podem ser
 *        sobre-carregados, igual ao caso da classe Carro que extende veiculo e
 *        sobre escreve o metodo exibeDados adicionando o dado de numero de
 *        portas.
 */
public class Main {
	public static void main(String[] args) {

		Carro carro = new Carro("Nissan");
		System.out.println("Carro");
		carro.exibeDados();
		System.out.println();

		Moto moto = new Moto("Honda");
		System.out.println("Moto");
		moto.exibeDados();
		System.out.println();

	}
}
