package javaBasico;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class E16_SobreMimTryCatch {
	public static void main(String[] args) {
		try {
			String nome, sobrenome;
			int idade;
			float altura;
			
			Scanner input = new Scanner(System.in).useLocale(Locale.US);
	        
	        System.out.print("Digite seu nome: ");
	        nome = input.next();
	        
	        System.out.print("Digite seu sobrenome: ");
	        sobrenome = input.next();
	
	        System.out.print("Digite sua idade: ");
	        idade = input.nextInt();
	        
	        System.out.print("Digite sua altura: ");
	        altura = input.nextFloat();
	        
	        System.out.println("/nOlá, me chamo " +nome.toUpperCase() + " " +sobrenome.toUpperCase());
	        System.out.println("Tenho " +idade + " anos ");
	        System.out.println("Minha altura é " +altura+ "cm");
		}
		catch(InputMismatchException e) { //coloca o erro que o compilador apontou como exception
			System.out.print("\t  Os campos idade e altura precisam ser numéricos!");
		}
		finally {
			String nome, sobrenome;
			int idade;
			float altura;
			
			Scanner input = new Scanner(System.in).useLocale(Locale.US);
	        
	        System.out.print("Digite seu nome: ");
	        nome = input.next();
	        
	        System.out.print("Digite seu sobrenome: ");
	        sobrenome = input.next();
	
	        System.out.print("Digite sua idade: ");
	        idade = input.nextInt();
	        
	        System.out.print("Digite sua altura: ");
	        altura = input.nextFloat();
	        
	        System.out.println("/nOlá, me chamo " +nome.toUpperCase() + " " +sobrenome.toUpperCase());
	        System.out.println("Tenho " +idade + " anos ");
	        System.out.println("Minha altura é " +altura+ "cm");
		}

	}

}
