package Interface;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Provas.QuestaoDica;
import Provas.QuestaoMultiplaEscolha;
import Provas.QuestaoSimples;



public class AplicarProva {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
	//declaro referencia 
		ArrayList<QuestaoSimples> lista;
	
	//instanciar esta lista 
		lista = new ArrayList<QuestaoSimples>();
		float acertos = 0;
		String resposta ;
		
	// como popular a lista 
		lista.add(new QuestaoSimples("Quem descobriu o Brasil","Pedro Alvares Cabral "));
		lista.add(new QuestaoDica("Qual o formato da Terra", "Redonda", "Bola"));
		lista.add(new QuestaoMultiplaEscolha("A melhor linguagem de programa��o � ?","JAVA","Phython","Pascal","Cobol","JavaScript"));
		lista.add(new QuestaoSimples("Os EUA ficam em qual continente?", "Americano"));
		
		for (QuestaoSimples q:lista) {
			resposta = JOptionPane.showInputDialog(q.aplicarquestao());
			if (q.corrigir(resposta)) {
				acertos = acertos + 1;
			}
		}
		
	
		// como eu leio essa lista 
		
		//QuestaoSimples  q[] = new QuestaoSimples[4];
	
		
	//q[0] = new QuestaoSimples("Quem descobriu o Brasil","Pedro Alvares Cabral ");
	//q[1] = new QuestaoDica("Qual o formato da Terra", "Redonda", "Bola");
	//q[2] = new QuestaoMultiplaEscolha("A melhor linguagem de programa��o � ?","JAVA","Phython","Pascal","Cobol","JavaScript");
	//q[3] = new QuestaoSimples("Os EUA ficam em qual continente?", "Americano");
	//}
	
	//como aplicar uma prova ?
	//for (int i =0; i<teste );
}