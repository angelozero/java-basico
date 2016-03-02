package br.com.angeloakm.construtores;

/**
 * 
 * @author angelo
 * @SOBRE Aqui mostro como se usa construtores na classe. A Classe triangulo
 *        pode ser instanciada sem parametros ou passando dois parametros para
 *        descubrir a area do triangulo.Se caso não houver parametros em sua
 *        chamada, por default foi setado o valor 2 para ambos os parametros. Se
 *        caso não houvesse o valor defaul, para se instanciar a classe seria
 *        obrigatorio passar os parametros requisitados como no caso da classe
 *        quadrado.
 */
public class Main {
	public static void main(String[] args) {

		Triangulo triangulo1 = new Triangulo();
		Triangulo triangulo2 = new Triangulo(3, 5);

		Quadrado quadrado = new Quadrado(12, 7);

		System.out.println(triangulo1.getArea());

		System.out.println(triangulo2.getArea());

		System.out.println(quadrado.getArea());

	}

}
