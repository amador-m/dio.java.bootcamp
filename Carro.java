package javaBasico.Carro;

public class Carro {
	public void ligar() {
		verificarCombustivel();
		verificarCambio();
		System.out.println("Carro ligado!");
	}
	private void verificarCombustivel() {
		System.out.println("Verificando o combustível");
	}
	private void verificarCambio() {
		System.out.println("Verificando o câmbio");
	}

}
