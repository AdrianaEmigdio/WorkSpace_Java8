package model;

/* aqui, como CARRO herda de Ve�culo, automaticamente ele se compromete a implementar os m�todos
 * abstratos que est�o descritos em ve�culo
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
		System.out.println("Carro "+super.marca+" acelera no p� VRUMMMMMM");
	}

	public void frear() {
		System.out.println("Carro "+super.marca+" freia na m�o! IIIIHHHHC");
		
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}