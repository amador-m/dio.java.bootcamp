package contaBanco;

import java.util.Scanner;

//C:\Users\LENOVO\git\dio.java.bootcamp

public class ContaTerminal {
	public static void main(String[] args) {
		int numero;
		String agencia,nomeCliente;
		float saldo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = input.nextLine();
		System.out.print("Digite o número da sua conta: ");
		numero = input.nextInt();
		input.nextLine();
		System.out.print("Digite a sua agência no formato 'XXX-X': ");
		agencia = input.nextLine();
		System.out.print("Digite o saldo da sua conta: ");
		saldo = input.nextFloat();
		
		System.out.printf("\nObrigado, %s, por criar sua conta conosco! Sua agência %s, conta número %d, já está ativa, e seu saldo de R$ %.2f está disponível para movimentação.",nomeCliente,agencia,numero,saldo);
	}

}
