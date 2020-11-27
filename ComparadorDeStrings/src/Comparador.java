public class Comparador {
	public static void main(String[] args) {

		/* abordagem 1 - usando Boxing */
//		String s1 = "Oi tudo bem? Vem sempre aqui?";
//		String s2 = "Oi tudo bem? Vem sempre aqui?";
		
		/* abordagem 2 - criando os pr�prios objetos */
		String s1 = new String("Oi tudo bem? Vem sempre aqui?");
		String s2 = new String("Oi tudo bem? Vem sempre aqui?");
		
		if (s1 == s2) {
			System.out.println("Apontam para a mesma �rea de mem�ria");
		}
		else {
			System.out.println("Apontam para �reas distintas da mem�ria");
		}
		
		// para comparar efetivamente STRINGS, eu obrigatoriamente uso EQUALS
		if (s1.equals(s2)) {
			System.out.println("Conte�dos Iguais");
		}
		else {
			System.out.println("Conte�dos diferentes");
		}
			
		
	}

}
