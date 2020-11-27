package model;

/* o que significa uma "classe abstrata"? Basicamente a defini��o de um "TEMPLATE", ou seja,
 * todo mundo qu herdar da classe abstrata vai ter esse padr�o m�nimo e poder�/dever� 
 * implementar algumas funcionalidades
 */

public abstract class Veiculo {
	protected String marca;
	protected String placa;
	
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}
	
	// uma coisa que eu S� CONSIGO FAZER COM CLASSES ABSTRATAS � a defini��o de M�TODOS ABSTRATOS
	// isto aqui � equivalente a um conjunto de cl�usulas contratuais, de forma que as classes
	// que HERDAM de Ve�culo s�o OBRIGADAS a implementar o c�digo destes m�todos
	public abstract void acelerar();
	public abstract void frear();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	

}