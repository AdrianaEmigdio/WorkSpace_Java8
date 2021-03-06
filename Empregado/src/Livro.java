
public class Livro {
public String titulo;
public String autor;
public int anoPublic;
public int posE;
public int posP;
public boolean esprestado;

public Livro(String titulo, String autor, int anoPublic, int posE, int posP, boolean esprestado) {

	this.titulo = titulo;
	this.autor = autor;
	this.anoPublic = anoPublic;
	this.posE = posE;
	this.posP = posP;
	this.esprestado = esprestado;
	
}

public String imprimir() {
		String res;
		res = "Livro: "+titulo+"/"+autor+" ("+anoPublic+")\n";
		
		String empr;
		if (esprestado) {
			empr = "Livro Emprestado";
		}
		else {
			empr = "Livro Disponivel no Acervo";
		}
		return res + empr;
}
public void emprestar () {
	this.esprestado = true;
	
}
public void devolver () {
	this.esprestado = false;
}
public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public int getAnoPublic() {
	return anoPublic;
}

public void setAnoPublic(int anoPublic) {
	this.anoPublic = anoPublic;
}

public int getPosE() {
	return posE;
}

public void setPosE(int posE) {
	this.posE = posE;
}

public int getPosP() {
	return posP;
}

public void setPosP(int posP) {
	this.posP = posP;
}

public boolean isEsprestado() {
	return esprestado;
}

public void setEsprestado(boolean esprestado) {
	this.esprestado = esprestado;
}

}