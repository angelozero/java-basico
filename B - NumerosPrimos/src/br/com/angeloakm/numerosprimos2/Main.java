package br.com.angeloakm.numerosprimos2;

public class Main {
	public static void main(String[] args) {
		int numPrimo = 0;
		int aux = 0;
		int firsNumPrimos = 1000;
		
		while (aux < firsNumPrimos) {
			numPrimo++;
			if (numeroPrimo(numPrimo)) {
				aux++;
				System.out.println("[" + aux + "] - " + numPrimo);
			}
		}
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
		// if (!isPrimo)
		// System.out.println(a + " x " + b + " = " + x);
		return isPrimo;
	}

}
