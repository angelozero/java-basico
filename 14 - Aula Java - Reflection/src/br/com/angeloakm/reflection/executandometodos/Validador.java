package br.com.angeloakm.reflection.executandometodos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Validador {
	public static boolean validarObjeto(Object obj)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		boolean resultado = true;

		Class<?> clazz = obj.getClass();
		// Retorna apenas metodos publicos
		// Verifico se o método da classe começa com o nome validar , se o tipo
		// do retorno deste método é booleano e se não há parametros
		for (Method m : clazz.getMethods()) {
			if (m.getName().startsWith("validar") && m.getReturnType() == boolean.class
					&& m.getParameterTypes().length == 0) {
				Boolean retorno = (Boolean) m.invoke(obj);
				resultado = resultado && retorno.booleanValue();
			}
		}

		return resultado;

	}

}
