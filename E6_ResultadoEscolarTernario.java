package javaBasico;

import java.util.Scanner;

public class E6_ResultadoEscolarTernario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float nota;
		String resultado;
		
		System.out.print("Exemplo 1 - Insira a nota do aluno: ");
		nota = input.nextFloat();
		resultado = nota >= 7 ? "Aprovado" : "Reprovado"; // ? = condição/ : = else
		
		System.out.println("\t"+resultado);

// *****************************************************************		
		
		float nota2;
		String resultado2;
		
		System.out.print("\nExemplo 2 - Insira a nota do aluno: ");
		nota2 = input.nextFloat();
		resultado2 = nota2 >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
		
		System.out.println("\t"+resultado2);		
	}

}
