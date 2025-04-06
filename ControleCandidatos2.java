package processoSeletivo;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos2 {
	public static void main(String[] args) {
		selecaoCandidatos();
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1; //se o valor entre 1 e 3 for igual a 1 significa que atenderam
	}
	
	static void selecaoCandidatos() {
		try {
			String [] nomeCandidatos = new String[10];
			String [] aprovados = new String[5];
			int i,j,candidatosSelecionados = 0;
			float salarioBase = 2000.f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Nomes dos candidatos\n");
			for(i=0;i<nomeCandidatos.length;i++) {
				System.out.print("\tDigite o seu nome: ");
				nomeCandidatos[i] = input.nextLine();
			} 
			i=0;
			System.out.println("\nProcesso seletivo");
			while(candidatosSelecionados < 5 && i < nomeCandidatos.length) {
				String candidato = nomeCandidatos[i];
				float salarioPretendido = valorPretendido();
				System.out.printf("\n\tO candidato %s solicitou um salario de R$ %.2f",nomeCandidatos[i],salarioPretendido);
				if(salarioBase >= salarioPretendido) {
					System.out.printf("\n\t\t%s foi selecionado(a) para a vaga!",candidato);
					aprovados[candidatosSelecionados] = candidato;
					candidatosSelecionados++;
				} else {
					System.out.printf("\n\t\t%s não foi selecionado(a) para a vaga!",candidato);
				}
				i++;
			}
			System.out.print("\n\nLista de aprovados\n");
			for (j = 0; j < candidatosSelecionados; j++) {
	            System.out.printf("\n\tO candidato nº %d é %s",(j+1),aprovados[j]);
	        }
			System.out.println("\n\nTentativas de contato");
			for(j = 0; j < candidatosSelecionados; j++) { 
				entrandoEmContato(aprovados[j]);
			}
			
		} catch(java.lang.ArrayIndexOutOfBoundsException E) {
			System.out.println("\n\nVoce está chamando elementos que está fora dos limites do array, ou seja, Out Of Bounds!!");
		}
	}
	
	static void entrandoEmContato(String aprovados) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.print("\n\tContato realizado com sucesso!");
			}
		}while(continuarTentando && tentativasRealizadas<3);
		if(atendeu) {
			System.out.printf("\n\t\tConseguimos contato com %s na %dª tentativa",aprovados,tentativasRealizadas);
		} else {
			System.out.printf("\n\tNão conseguimos contato com %s após 3 tentativas",aprovados);
		}
	}
	
	static float valorPretendido() {
		return ThreadLocalRandom.current().nextFloat(1800,2200); //retorna um valor aleatório dentro do intervalo estabelecido
	}
	
}
