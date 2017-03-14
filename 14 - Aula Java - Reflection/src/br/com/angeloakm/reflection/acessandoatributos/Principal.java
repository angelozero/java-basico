package br.com.angeloakm.reflection.acessandoatributos;

public class Principal {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		Usuario u = new Usuario();

		u.setAtivo(true);
		u.setEmail("email");
		u.setLogin("login");
		u.setPapel("papel");
		u.setSenha("senha");

		String xml = GeradorXML.getXML(u);

		System.out.println(xml);
	}

}
