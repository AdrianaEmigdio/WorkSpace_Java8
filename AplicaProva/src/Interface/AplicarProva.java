package Interface;

import java.util.Scanner;

import Provas.QuestaoSimples;
import Provas.QuestaoSimples;
import Provas.QuestaoDica;
import Provas.QuestaoMultiplaEscolha;


public class AplicarProva {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
	QuestaoSimples  q[] = new QuestaoSimples[4];
	
		
	q[0] = new QuestaoSimples("Quem descobriu o Brasil","Pedro Alvares Cabral ");
	q[1] = new QuestaoDica("Qual o formato da Terra", "Redonda", "Bola");
	q[2] = new QuestaoMultiplaEscolha("A melhor linguagem de programação é ?","JAVA","Phython","Pascal","Cobol","JavaScript");
	q[3] = new QuestaoSimples("Os EUA ficam em qual continente?", "Americano");
	}
	
	//como aplicar uma prova ?
	//for (int i =0; i<teste )
}