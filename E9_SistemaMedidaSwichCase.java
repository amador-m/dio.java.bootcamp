package javaBasico;

import java.util.Scanner;

public class E9_SistemaMedidaSwichCase {
	public static void main(String[] args) {
		String tamanho;
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da roupa (P, M ou G): ");
        tamanho = input.nextLine();
        
        switch(tamanho) {
        	case "P": 
	        	System.out.println("\tPequeno");
	        	break;
	        case "M":
	        	System.out.println("\tMédio");
	        	break;
	        case "G":
	        	System.out.println("\tGrande");
	        	break;
	        default:
	        	System.out.println("\tIndefinido");
	        }

	}

}
