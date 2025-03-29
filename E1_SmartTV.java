package javaBasico;

import java.util.Scanner;

public class E1_SmartTV {
		boolean ligada = false;
		int canal = 5;
		int volume = 9;
		
		Scanner input = new Scanner(System.in);
		
		public void ligar() {
			ligada = true;			
		}
		public void desligar() {
			ligada = false;			
		}
		public void aumentarVolume() {
			volume++;
		}
		public void diminuirVolume() {
			volume--;			
		}
		public void aumentarCanal() {
			canal++;			
		}
		public void diminuirCanal() {
			canal--;			
		}
		public void escolherCanal() {
			System.out.print("\nDigite o canal desejado: ");
			canal = input.nextInt();			
		}
	}


