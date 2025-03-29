package javaBasico;

import java.util.Scanner;

public class SistemaNotas {
	public static void main(String[] args) {
		float nota1,nota2,soma,media;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a nota 1 do aluno: ");
		nota1 = input.nextFloat();
		System.out.print("Insira a nota 2 do aluno: ");
		nota2 = input.nextFloat();
		soma = nota1 + nota2;
		media = soma / 2;
		
		if(media >= 7) {
			System.out.println("\nAprovado");
		} else if(media >= 5 && media <= 7) {
			System.out.println("\nRecuperação");
		} else {
			System.out.println("\nReprovado");
		}
			
	}

}
