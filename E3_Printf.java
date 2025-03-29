package javaBasico;

import java.util.Scanner;

public class E3_Printf {
	public static void main(String[] args) {
		String nome; 
		String nascimento;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome = input.nextLine();
		System.out.print("Digite a sua data de nascimento: ");
		nascimento = input.nextLine();
		System.out.printf("\n%s nasceu no dia %s",nome,nascimento);
		input.close();
				
		}

	}