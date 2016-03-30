package br.com.angeloakm.interfaces;

public class FileAutenticador implements Autenticador {

	@Override
	public boolean autenticar(String user, String pswrd) {
		if (!(user.isEmpty() && pswrd.isEmpty()))
			return true;
		else
			return false;
	}

}
