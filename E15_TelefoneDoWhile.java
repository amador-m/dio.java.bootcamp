package javaBasico;

import java.util.Random;

public class E15_TelefoneDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...\n");
		do {
			// executando repetidamente até ater=nderem
			System.out.println("Telefone tocando");
		} while(tocando());
		System.out.println("\nAlô?");
	}
	public static boolean tocando() { // boolean porque só existem 2 alternativas: atendeu ou não atendeu
		boolean atendeu = new Random().nextInt(3) == 1; // como é aleatório muda a cada vez que executo o programa
		System.out.println("Atendeu? "+atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}

}
