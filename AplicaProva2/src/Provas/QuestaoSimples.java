package Provas;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;

	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public boolean corrigir1 (String respostaaluno) {
		if (this.resposta.contentEquals(respostaaluno)) {
			return true;
		}
		
		else{
			return false;
		}
	}
public String aplicarquestao() {
	return "Enunciado" +this.enunciado;
}	
public boolean corrigir (String respAluno){
	return this.resposta.equals(respAluno);
}		
}




		

 

