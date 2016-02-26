package br.com.angeloakm.numerosprimos;

/**
 * 
 * @author angelo
 * @SOBRE Metodo de verificação de números primos.
 */
public class Main {
	public static void main(String[] args) {

		int numPrimo = 7777731;
		if (numeroPrimo(numPrimo))
			System.out.println(numPrimo + " --- é um numero primo");
		else
			System.out.println(numPrimo + " --- não é um numero primo");
	}

	public static boolean numeroPrimo(int x) {
		boolean isPrimo = Boolean.FALSE;
		int a = 0;
		int b = 0;

		if (x > 0) {
			for (int i = x; i > 1; i--) {
				if (i != x) {
					if (x % i == 0) {
						if (a == 0)
							a = i;
						else
							b = i;

						isPrimo = Boolean.FALSE;
					}
				} else
					isPrimo = Boolean.TRUE;
			}
		}
		if (!isPrimo)
			System.out.println(a + " x " + b + " = " + x);
		return isPrimo;
	}

}
