/* aqui estamos  definindo a classe Produto 
 * classe para n�s, significa" novo tipo de dado " 
 * esse tipo em especial vai armazenar 
 */
public class Produto {
	int codigo;
	String nome;
	double preco, descontop;
	int qtde;
	String categoria;
	
	// o segredo dos metodos � poder ter um trecho de codigo que obedece o padr�o ent, processo e saida
	
	void imprimir() {
		System.out.println("Produto "+codigo+" - " + nome);
		System.out.println("Categoria "+categoria);
		System.out.println("Preco R$ "+preco+" Quantidade Estoque " + qtde);
		
	}
	double calcularDesconto (double desconto){
		return preco - preco * desconto/100 ; 
	}
}