package javaBasico;

import java.util.Scanner;

public class E8_SistemaMedidaIfElse {
	public static void main(String[] args) {
		String tamanho;
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da roupa (P, M ou G): ");
        tamanho = input.nextLine();

		if(tamanho.equalsIgnoreCase("P")) {
			System.out.println("\tPequeno");
		} else if(tamanho.equalsIgnoreCase("M")) {
			System.out.println("\tMédio");
		} else if(tamanho.equalsIgnoreCase("G")) {
			System.out.println("\tGrande");
		} else {
			System.out.println("\tIndefinido");
		}
	}
}
