
public class Principal {
	public static void main(String[] args) {
		
	// declarei uma variavel do tipo Produto e chamei de p 	
		Produto p;
		Produto p2;
		
	// o que faz o opoerador NEW?
	// basicamente ele cria a area de memoria correspondente a estrutura do tipo de produto	
	
	p = new Produto();
	p2 = new Produto();
	
	// vamos preencher o produto com valores ?
	p.codigo = 123;
	p.nome = "Bolsa Luis Vintao";
	p.preco = 29.90;
	p.categoria = "Acessorios";
	p.qtde = 10;
	
	p2.codigo = 456;
	p2.nome = "Relogio Rolequizz";
	p2.preco = 59.90;
	p2.categoria = "Moda Fina";
	p2.qtde = 6;
	
	p.imprimir();

	double novopreco1;
	novopreco1 = p.calcularDesconto(20.0);
	System.out.println("Desconto Promocional "+novopreco1);
	System.out.println();
	
	p2.imprimir();
	double novopreco2;
	novopreco2 = p2.calcularDesconto(20.0);
	System.out.println("Desconto Promocional "+novopreco2);
	
	}
}


