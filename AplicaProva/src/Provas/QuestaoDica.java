package Provas;

public class QuestaoDica extends QuestaoSimples {
	private String dica ;

		
	public QuestaoDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	
	public boolean corrigir (String respostaaluno) {
		if (this.resposta.contentEquals(respostaaluno)) {
			return true;
		}
		
		else{
			return false;
		}
	}	
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}


	@Override
	public String toString() {
		return "QuestaoDica [dica=" + dica + ", enunciado=" + enunciado + ", resposta=" + resposta + ", getEnunciado()="
				+ getEnunciado() + ", getResposta()=" + getResposta() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
