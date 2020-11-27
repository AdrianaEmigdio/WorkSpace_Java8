package core;

public class ContaEspecial extends ContaBase{

	private float  limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public boolean debitar(float valor) {
		if (valor <= super.saldo + this.limite) {
			super.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numeroConta="
				+ numeroConta + ", saldo=" + saldo + "]";
	}	

}
