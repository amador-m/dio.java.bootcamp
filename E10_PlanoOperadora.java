package javaBasico;

import java.util.Scanner;

public class E10_PlanoOperadora {
	public static void main(String[] args) {
		String plano;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite qual plano da nossa operadora você deseja conhecer (Turbo, Mega ou Básico): ");
		plano = input.nextLine();
		
		switch(plano) {
		case "Turbo": // sem break para dar continuidade nas mensagens, por isso esta em ordem decrescente (do plano mais completo ao menos)
			System.out.println("\n\t- 5GB YouTube");
		case "Mega":
			System.out.println("\t- WhatsApp e Instagram grátis");
		case "Básico":
			System.out.println("\t- 100 minutos de ligação"); 
		}
	}

}
