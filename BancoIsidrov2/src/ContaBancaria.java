
public class ContaBancaria {
	private int    numeroConta;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	// j� que os atributos est�o "blindados" (encapsulados), precisamos criar m�todos para
	// tanto modificar quanto consultar os valores destes atributos
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
		// ou seja, somo ao saldo o valor passado como par�metro
	}
	
	

	public boolean sacar(double valor) {
		if (saldo >= valor) {  // tenho saldo suficiente
			saldo = saldo - valor;
			return true;   // indicando que o saque foi autorizado
		}
		else {
			return false;  // retornar false indica que o saque n�o foi autorizado
		}
	}
	
	public String mostrarInfo() {
		String infoConta;
		infoConta = "Conta "+numeroConta+" / "+nomeTitular+" ("+cpfTitular+")  R$  "+saldo;
		return infoConta;
	}
}