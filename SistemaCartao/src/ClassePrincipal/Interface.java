package ClassePrincipal;

import Cartao.CartaoPrePago;
import Cartao.CartaoCashBack;


public class Interface {
	public static void main (String [] args ) {
		/* segredo do sucesso em heran�a/polimorfismo
		 * 
		 * Passo 1 - declarar gen�rico (da classe Pai)
		 */
		CartaoPrePago cartoes[]; 
		cartoes = new CartaoPrePago[4];
		
		
		/* Passo 2 - Instanciar espec�fico - Pode ser tanto classe Pai quanto classes filhas 
		 * 
		 */
		
		cartoes[0] = new CartaoPrePago ("1111", "Cliente 1", 2021,10, 1000.0);
		cartoes[1] = new CartaoCashBack("2222", "Cliente 2", 2021,10, 1000.0, 1);
		cartoes[2] = new CartaoCashBack("3333", "Cliente 3", 2021,10, 1000.0, 2);
		cartoes[3] = new CartaoCashBack("4444", "Cliente 4", 2021,10, 1000.0, 3);
		
		
		for (CartaoPrePago c: cartoes) {
			System.out.println(c);
		}
		
		for (CartaoPrePago c: cartoes) {
			if (c.comprar(100.0)) {
				System.out.println("Compra Autorizada");
			}
		}
		
		for (CartaoPrePago c: cartoes) {
			System.out.println(c);
		}		

	}
}