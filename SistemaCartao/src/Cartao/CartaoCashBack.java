package Cartao;

public class CartaoCashBack extends CartaoPrePago {

	private int tipo ;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	// 1 - GOLD / 2 - SILVER / 3 - BRONZE
	
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			// aqui vem a lógica do cashback
			
			if (tipo == 1) {
				super.saldo += valor * 0.08;
			}
			else if (tipo == 2) {
				super.saldo += valor * 0.05;
			}
			else if (tipo == 3) {
				super.saldo += valor * 0.02;
			}
			
			return true;
		}
		else {
			return false;
		}
	}
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
