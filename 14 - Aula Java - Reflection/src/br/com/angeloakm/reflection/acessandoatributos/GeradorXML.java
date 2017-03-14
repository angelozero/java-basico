package br.com.angeloakm.reflection.acessandoatributos;

import java.lang.reflect.Field;

public class GeradorXML {
	public static String getXML(Object obj) throws IllegalArgumentException, IllegalAccessException {

		StringBuilder sb = new StringBuilder();

		Class<?> c = obj.getClass();
		sb.append("<" + c.getSimpleName() + "> \n");

		for (Field f : c.getDeclaredFields()) {
			sb.append("<" + f.getName() + ">");
			f.setAccessible(true);
			sb.append(f.get(obj));
		}

		sb.append("</" + c.getSimpleName() + "> \n");
		return sb.toString();
	}
}
