package br.com.angeloakm.javabasico.vargs;

public class Main {
	public static void main(String[] args) {

		int a = somar(1, 2);
		int b = somarN(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int c = 10;

		TesteObj objeto = new TesteObj();
		objeto.numero = 7;

		receberO(objeto);
		receberN(c);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(objeto.numero);

	}

	public static void receberO(TesteObj obj) {
		// Se esta linha estivesse descomentada a variavel passada no parametro
		// iria receber uma nova referencia e nada aconteceria
		// obj = new TesteObj();

		// Se a linha de cima estiver comentada a variavel que referencia o
		// objeto passado "atualiza" o objeto
		obj.numero = 5;
	}

	public static void receberN(int x) {
		x = 10;
	}

	// método para somar dois valores
	public static int somar(int x, int y) {
		return x + y;
	}

	// método para somar N valores
	public static int somarN(int... numeros) {
		int retorno = 0;
		for (int i = 0; i < numeros.length; i++) {
			retorno += numeros[i];
		}
		return retorno;
	}

}
