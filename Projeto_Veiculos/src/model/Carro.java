package model;

/* aqui, como CARRO herda de Veículo, automaticamente ele se compromete a implementar os métodos
 * abstratos que estão descritos em veículo
 * 
 * a classe-pai define o "O QUE"
 * as classes-filhas definem o "COMO"
 */
public class Carro extends Veiculo{
	
	private int ano;

	public Carro(String marca, String placa, int ano) {
		super(marca, placa);
		this.ano = ano;
	}
	
	public void acelerar() {
		System.out.println("Carro "+super.marca+" acelera no pé VRUMMMMMM");
	}

	public void frear() {
		System.out.println("Carro "+super.marca+" freia na mão! IIIIHHHHC");
		
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}