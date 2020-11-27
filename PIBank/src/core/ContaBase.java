package core;

public class ContaBase {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	protected float debitar;
	protected float creditar;

	public ContaBase(String nomeTitular, String cpf, int numeroConta, float saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void creditar(float valor) {
		this.saldo += valor;
	}

	public boolean debitar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getDebitar() {
		return debitar;
	}

	public void setDebitar(float debitar) {
		this.debitar = debitar;
	}

	public float getCreditar() {
		return creditar;
	}

	public void setCreditar(float creditar) {
		this.creditar = creditar;
	}

	@Override
	public String toString() {
		return "ContaBase [numeroConta=" + numeroConta + ", saldo=" + saldo + ", debitar=" + debitar + ", creditar="
				+ creditar + "]";
	}
}
