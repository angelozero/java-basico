package br.com.angeloakm.reflection.criandoobjetos;

public class Principal {
	public static void main(String[] args) throws Exception {

		Mapeador m = new Mapeador();
		m.load("classes.prop");

		// List l = m.getInstancia(List.class);
		//
		// System.out.println(m.getImplementacao(List.class));
		// System.out.println(m.getImplementacao(Map.class));

		InterfaceExemplo i = m.getInstancia(InterfaceExemplo.class, "teste");

		System.out.println(i.getClass());

	}

}
