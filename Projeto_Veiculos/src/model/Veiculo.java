package model;

/* o que significa uma "classe abstrata"? Basicamente a definição de um "TEMPLATE", ou seja,
 * todo mundo qu herdar da classe abstrata vai ter esse padrão mínimo e poderá/deverá 
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
	
	// uma coisa que eu SÓ CONSIGO FAZER COM CLASSES ABSTRATAS é a definição de MÉTODOS ABSTRATOS
	// isto aqui é equivalente a um conjunto de cláusulas contratuais, de forma que as classes
	// que HERDAM de Veículo são OBRIGADAS a implementar o código destes métodos
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