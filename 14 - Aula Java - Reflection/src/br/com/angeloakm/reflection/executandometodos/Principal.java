package br.com.angeloakm.reflection.executandometodos;

import java.lang.reflect.InvocationTargetException;

public class Principal {
	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

		Usuario u = new Usuario();

		// True - Objeto valido
		u.setEmail("email@");
		u.setSenha("12345678");
		boolean retorno1 = Validador.validarObjeto(u);

		System.out.println(retorno1);

		// False - Objeto invalido
		u.setEmail("email");
		u.setSenha("1234567");
		boolean retorno2 = Validador.validarObjeto(u);

		System.out.println(retorno2);

	}
}
