package javaBasico.ServicoDeMensagens3;

import java.util.Scanner;

import javaBasico.ServicoDeMensagens3.Apps.Facebook;
import javaBasico.ServicoDeMensagens3.Apps.MSNMessenger;
import javaBasico.ServicoDeMensagens3.Apps.Telegram;

public class ComputadorUsuario {
	public static void main(String[] args) {
		ServicoDeMensagensPai sm = null;
		// null pois não se sabe qual app, mas todos devem enviar e receber mensagens
		
		Scanner input = new Scanner(System.in);
		
		String appEscolhido = new String();
		System.out.print("Digite o app de mensagens que deseja entrar: ");
		appEscolhido = input.nextLine();
		
		if(appEscolhido.equalsIgnoreCase("msn")) {
			sm = new MSNMessenger();
		}
		else if(appEscolhido.equalsIgnoreCase("facebook")) {
			sm = new Facebook();
		}
		else if(appEscolhido.equalsIgnoreCase("telegram")) {
			sm = new Telegram();
		}
		else {
			System.out.println("Digite um app que você já tenha instalado!");
		}
		System.out.println();
		sm.enviarMensagem();
		sm.receberMensagem();
	}

}
 