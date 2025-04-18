package javaBasico.Carro;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("789421");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("142402");
		z400.ligar();
		
		Veiculo coringa = jeep;
		coringa.ligar();
	}

}