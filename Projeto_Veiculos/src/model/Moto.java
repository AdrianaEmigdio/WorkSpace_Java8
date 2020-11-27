package model;

public class Moto extends Veiculo{
	private String tipo;

	public Moto(String marca, String placa, String tipo) {
		super(marca, placa);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.marca+" acelera na m�o PROPROPROPRORPORPRO");
	}

	@Override
	public void frear() {
		System.out.println("Moto "+super.marca+" freia no p�! VZZZZZAIIDFIASFDAVAds");
	}
	
	

}