package model;

public abstract class Funcionario{

	protected String nome;
	protected int numeroRegistro;
	
	public abstract float calcularSalario();

	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	public  String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}


	
	
}
