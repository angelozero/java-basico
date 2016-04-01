package br.com.angeloakm.string.datas.numeros;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		String firstName = "Angelo";
		String lastName = "Ferreira";
		String finalName = "";
		int idade = 25;

		finalName = firstName + "" + lastName;

		System.out.println(finalName + " " + idade + " anos --- DATA:" + new Date().toString());
	}

}
