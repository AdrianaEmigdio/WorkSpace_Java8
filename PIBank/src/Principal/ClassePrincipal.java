package Principal;

import core.ContaBase;
import core.ContaEspecial;


//polimorfismo

/*   POLI = muitos
 *   MORFOS = formas
 *   
 *    Muitas formas de uma referência assumir uma instÂncia de um objeto
 *    
 *    Conta c; significa que tenho uma referência a uma classe pai
 *    
 *    isso me permite (e só herança permite isso) instanciar qualquer objeto da hierarquia toda de classes
 *    
 *    c = new Conta(...)
 *     ou
 *    c = new ContaEspecial(...)
 *    
 *    portanto a referÊncia "c" pode assumir quais "formas"? Tanto da classe-pai Conta 
 *    quanto da classe-filha ContaEspecial
 * 
 * 
 * 
 * 
 * 
 */
public class ClassePrincipal {
	public static void main(String[] args) {
		
		
		ContaBase c[];  // aqui estou declarando um conjunto chamado "c" de várias contas (é como se eu tivesse
		            // uma série de variáveis do tipo "Conta"
		
	    c = new ContaBase[5]; // quando uso o new associado aos colchetes, na verdade eu não tenho os objetos
	                       // eu tenho apenas o conjunto de referências
		
		
		c[0] = new ContaBase("Cliente 0","CPF0",1010,100);
		c[1] = new ContaEspecial("ClienteEspecial 1", "CPF1", 1011, 100, 110);
		c[2] = new ContaBase("Cliente 2","CFP2",1012,120);
		c[3] = new ContaEspecial("ClienteEspecial 3", "CPF3", 1013, 100, 130);
		c[4] = new ContaBase("Cliente 4","CPF4",1014,140);
		
		/*
		for(int pos=0; pos < 5; pos++) {
			if (c[pos].debitar(150.0f)) {
				System.out.println("Debito de R$ 150,00 efetivado na conta "+c[pos].getNumeroConta()+
						           " Saldo = R$ "+c[pos].getSaldo() + " Cliente: "+c[pos].getNomeTitular()+
						           "/"+c[pos].getCpf());
			}
			else {
				System.out.println("Debito de R$ 150,00 não autorizado na conta "+c[pos].getNumeroConta()
						         + " Cliente: "+c[pos].getNomeTitular()+ "/"+c[pos].getCpf());
			}
		}
		*/
		
		
		// existe uma variação da instrução FOR que serve exclusivamente para CONJUNTOS
		// programadores Java referem-se a esta variação como FOR EACH
		
		for (ContaBase x: c) {  // para cada conta x dentro do vetor c
			if (x.debitar(150)) {
				System.out.println("Debito autorizado na conta "+x.getNumeroConta());
			}
			else {
				System.out.println("Debito nao autorizado na conta "+x.getNumeroConta());
			}
		}
		
		
		
		
		
		
		
		/*Conta co = new Conta("Isidro","987.654.321-00", 12321, 500.0f);
		ContaEspecial ce = new ContaEspecial("Rodinelson", "123.456.789-00", 98789, 500.0f, 300.0f);
		
		
		Conta c = new ContaEspecial("Jose","1234567", 1234, 300.0f, 2000f);
		
		if (c.debitar(350.0f)) {
			System.out.println("Debito efetivado ");
		}
		else {
			System.out.println("Debito negado");
		}
		
		System.out.println(c);
		
		/*
		System.out.println(co);
		if (co.debitar(750.0f)) {
			System.out.println("Debito autorizado na conta "+co.getNumeroConta());
			System.out.println("Novo saldo = R$ "+co.getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente para saque na conta "+co.getNumeroConta());
		}
		
		
		
		System.out.println(ce);
		if (ce.debitar(750.0f)) {
			System.out.println("Debito autorizado na conta "+ce.getNumeroConta());
			System.out.println("Novo saldo = R$ "+ce.getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente para saque na conta "+ce.getNumeroConta());
		}
		*/
		
	}

}