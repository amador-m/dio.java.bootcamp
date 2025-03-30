package javaBasico;

import java.util.Scanner;

public class E12_NotasForArray {
	public static void main(String[] args) {
		String [] aluno = new String[4];
		float [] nota = new float[4];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sistema de notas\n");
		for(int i=0;i<4;i++) {
			System.out.print("\t- Digite o nome do aluno: ");
			aluno[i] = input.nextLine();
			System.out.printf("\t- Digite a nota de %s: ",aluno[i]);
			nota[i] = input.nextFloat();
			input.nextLine();
		}
			
// ******************************************************************************
			String [] nomes = {"Felipe","Ana","Juliana"};
			
			System.out.println("\nExemplo de for : each\n");
			for(String nome : nomes) { // a cada interação de nomes, o nome atual (índice/posição) vai atualizar automaticamente essa variável
				System.out.println("\t- O nome do aluno é: "+nome);
		}
	}

}
