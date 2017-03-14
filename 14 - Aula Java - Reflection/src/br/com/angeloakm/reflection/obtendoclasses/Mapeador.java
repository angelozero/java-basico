package br.com.angeloakm.reflection.obtendoclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Mapeador {
	
	private Map<Class<?>, Class<?>> mapa = new HashMap<>();

	public void load(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException {

		Properties p = new Properties();
		p.load(new FileInputStream(nomeArquivo));

		for (Object key : p.keySet()) {
			Class<?> interfac = Class.forName(key.toString());
			Class<?> impl = Class.forName(p.get(key).toString());

			
			if(interfac.isInterface()){
				System.out.println(interfac.getName() + " é uma interface");
			}
			
			if(!interfac.isAssignableFrom(impl)){
				throw new RuntimeException("A classe " + impl.getName() + " não implementa " + interfac.getName());
			}
			
			mapa.put(interfac, impl);
		}

	}

	public Class<?> getImplementacao(Class<?> interf) {
		return mapa.get(interf);
	}

}
