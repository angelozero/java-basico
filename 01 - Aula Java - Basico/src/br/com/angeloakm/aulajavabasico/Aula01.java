package br.com.angeloakm.aulajavabasico;

/**
 * 
 * @author angelo
 * @SOBRE AULA 01 - Estudo de variaveis, laços e condições
 */
public class Aula01 {
	public static void main(String[] args) {

		int x = 0;

		while (x < 10) {
			if (x < 2) {
				switch (x) {
				case 1:
					System.out.println("X é igual a 1");
					break;
				default:
					break;
				}
			}
			x++;
		}

		// Exbibe 10
		System.out.println(x++);
		// Exibe 12
		System.out.println(++x);

		System.out.println(x);
	}

}
