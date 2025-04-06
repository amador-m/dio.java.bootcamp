package processoSeletivo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
	public static void main(String[] args) {
		float [] salarioPretendido = new float[3];
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Processo seletivo");
		for(i=0;i<salarioPretendido.length;i++) {
			System.out.print("\nDigite a sua pretensão salarial: R$ ");
			salarioPretendido[i] = input.nextFloat();
			analisarCandidato(salarioPretendido[i]);
		}
	}
	static void analisarCandidato(float salarioPretendido) {
		float salarioBase = 2000.f;
		if(salarioBase > salarioPretendido) {
			System.out.println("\tLigar para o candidato");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("\tLigar para o candidato com uma contra proposta");
		} else {
			System.out.println("\tAguardando o resultado dos demais candidatos");
		}
	}
}
