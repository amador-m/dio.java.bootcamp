package javaBasico;

import java.util.Scanner;

public class E11_ContagemCarneirinhos {
	public static void main(String[] args) {
		int carneirinhos;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Contegem dos carneirinhos:\n");
		
		for(carneirinhos=1;carneirinhos<=20;carneirinhos++) {
			System.out.println("\t- "+carneirinhos+" carneirinho(s)");
		}
	}

}
