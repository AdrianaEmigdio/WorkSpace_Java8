package model;

public class Comissionado extends Funcionario {
	
	private float  SalarioBase;
	private float comissao;
	
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		SalarioBase = salarioBase;
		this.comissao = comissao;
	}
	public float getSalarioBase() {
		return SalarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		SalarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
	public float calcularSalario() {
		
		return  SalarioBase + SalarioBase*comissao/100;
		
		
	}
 
}
