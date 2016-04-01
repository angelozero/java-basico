package br.com.angeloakm.enums;

/**
 * 
 * @author angelo
 * @SOBRE Podemos definir valores aos atributos M e F que no caso quero que retorne "Masculino" e "Feminino"
 * isso é possivel setando no construtor da classe o atributo que cada item tem. No caso M recebe uma String ja J recebe um int
 * Quando se chama enum Sexo você pode ter como retorno tanto uma string como um inteiro, basta definir qual item sera passado na chamada da classe
 */
public enum Sexo {

	M("Masculino"), F("Feminino"), J(10);

	private String sexoStr;
	private int sexoNum;
	
	Sexo(String sexoStr){
		this.sexoStr = sexoStr;
	}
	Sexo(int sexoNum){
		this.sexoNum = sexoNum;
	}
	
	
	public String getSexoDesc() {
		return this.sexoStr;
	}
	
	public int getSexoNum() {
		return this.sexoNum;
	}

}
