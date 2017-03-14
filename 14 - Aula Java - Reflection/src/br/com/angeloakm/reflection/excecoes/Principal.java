package br.com.angeloakm.reflection.excecoes;

import java.lang.reflect.Method;

public class Principal {
	public static void main(String[] args) throws Exception {

		TesteErros obj = new TesteErros();

		Class clazz = obj.getClass();

		Method m1 = clazz.getMethod("metodoPublico", String.class);

		Method m2 = clazz.getMethod("metodoPrivado", String.class);

	}
}
