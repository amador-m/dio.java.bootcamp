package javaBasico;

public class E13_ExemploBreakContinue {

	public static void main(String[] args) {
		System.out.println("Exemplo com o break");
		for(int numero=0;numero<5;numero++) {
			if(numero == 3) {
				break; // interrompe a execução do código
			}
			System.out.println("\t- Número: "+numero);
		}
		System.out.println("\nExemplo com o continue");
		for(int numero2=0;numero2<5;numero2++) {
			if(numero2 == 3) {
				continue; // só muda o fluxo da interação específica, no caso, se o nº for igual a 3 o código vai continuar sem nem exibir a mensagem dele
			}
			System.out.println("\t- Número: "+numero2);
		}

	}

}
