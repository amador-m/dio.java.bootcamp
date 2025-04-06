package controleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
			int num1,num2,interacoes,i;
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite o número 1: ");
			num1 = input.nextInt();
			System.out.print("Digite o número 2: ");
			num2 = input.nextInt();
		try {
			contar(num1,num2);	
		} catch(ParametrosInvalidosException e) {
			}
		}
		static void contar(int num1, int num2) throws ParametrosInvalidosException {
	        if (num1 > num2) {
	            throw new ParametrosInvalidosException();
	        }
	        int interacoes = num2 - num1;
	        System.out.printf("\nQuantidade de interações: %d",interacoes);
	        for (int i=0;i<interacoes;i++) {
	            System.out.printf("\n\t- Imprimindo o número %d",(i+1));
	        }
	}

}
