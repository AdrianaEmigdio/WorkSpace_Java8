public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	/* este � o m�todo construtor - ele s� � chamado no momento do NEW
	 * O cabe�alho dele � um pouco diferente dos demais, por n�o ter tipo de retorno e
	 * por ter o nome exatamente igual ao nome da classe
	 */
	public Empregado(String nome, String cargo, double salario) {
		this.nome    = nome;
		this.cargo   = cargo;
		this.salario = salario;
	}
	/* Ok, mas ser� que eu posso criar um Empregado passando apenas o nome e o cargo?
	 * SIM, para isso usamos uma caracter�stica da lingaugem JAVA cahamada SOBRECARGA
	 */
	
	public Empregado(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = 1000.00;
	}
	
	public Empregado(String nome) {
		this.nome = nome;
		this.cargo = "Cargo nao definido";
		this.salario = 1000.00;
	}

	
	
	public void aumentarSalario(double percentual) {
		this.salario = this.salario + this.salario * percentual / 100;
	}
	
	public String imprimir() {
		String resultado;
		resultado = "Empregado: "+this.nome+" / "+this.cargo+"  R$ "+String.format("%.2f",this.salario);
		return resultado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
