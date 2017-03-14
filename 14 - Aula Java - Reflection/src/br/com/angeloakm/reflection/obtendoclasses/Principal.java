package br.com.angeloakm.reflection.obtendoclasses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

		Mapeador m = new Mapeador();

		m.load("classes.prop");

		System.out.println(m.getImplementacao(List.class));
		System.out.println(m.getImplementacao(Map.class));
	}

}
