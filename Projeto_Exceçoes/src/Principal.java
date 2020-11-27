import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int a, b, res;
		
		
		try {
			System.out.println("Digite o valor de a ");
			a = teclado.nextInt();
			teclado.close();
			System.out.println("Digite o valor de b ");
			b = teclado.nextInt();
			res = a / b;
			System.out.println("Resultado da divisao = "+res);
		}
		
		catch (InputMismatchException e1) {
			System.out.println("Ei, voce deve digitar um valor inteiro");
		}
		catch (ArithmeticException e2) {
			System.out.println("Ei, a divisao nao pode ser por zero!");
		}
		catch (Exception ex) {
			System.out.println("Ops.. erro genérico");
			System.out.println(ex.getStackTrace()[ex.getStackTrace().length-1]);
		}
	}

}