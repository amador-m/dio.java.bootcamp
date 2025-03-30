package javaBasico;

import java.util.concurrent.ThreadLocalRandom;

public class E14_MesadaWhile {

	public static void main(String[] args) {
		float mesada = 50.0f, valorDoce = valorAleatorio();
		
		while(mesada>0) {
			if(valorDoce > mesada) {
				valorDoce = mesada;
			}
			System.out.printf("O doce de R$ %.2f foi adicionado ao carrinho de compras\n",valorDoce);
			mesada -= valorDoce;
		}
		System.out.printf("\n\nMesada restante de R$ %.2f",mesada);
		System.out.println("\nTodo o dinheiro da mesada foi gasto!");
	}
	public static float valorAleatorio() {
		return Math.round(ThreadLocalRandom.current().nextFloat(1,10));
	}

}
