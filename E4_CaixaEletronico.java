package javaBasico;

import java.util.Scanner;

public class E4_CaixaEletronico {
	public static void main(String[] args) {
		float saldo = 10000,valorSolicitado;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor que você deseja sacar da sua conta: ");
		valorSolicitado = input.nextFloat();
		
		if (valorSolicitado <= saldo) {
			saldo -= valorSolicitado;
			System.out.printf("\nApós o saque de R$ %.2f seu saldo corresponde a R$ %.2f",valorSolicitado,saldo);
		} else {
			System.out.printf("\nO seu saldo é de %.2f, solicite um valor menor ou igual a ele!",saldo);
		}
	}

}
