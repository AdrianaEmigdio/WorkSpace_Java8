package model;

public class Chefe extends Funcionario{
	
	
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTermo;
		
	
		public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTermo,
			float salario) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTermo = beneficioTermo;
		
	}


	public float getSalarioBase() {
		return salarioBase;
	}
	
	
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTermo() {
		return beneficioTermo;
	}
	public void setBeneficioTermo(float beneficioTermo) {
		this.beneficioTermo = beneficioTermo;
	}

	
	public float calcularSalario() {
		
		return  salarioBase + salarioBase*adicionalFuncao/100 + beneficioTermo;
		
		
	}
	
	
	
		
	}
	
	
	

