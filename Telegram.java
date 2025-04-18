package javaBasico.ServicoDeMensagens3.Apps;

import javaBasico.ServicoDeMensagens3.ServicoDeMensagensPai;

public class Telegram extends ServicoDeMensagensPai {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");	
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem feita pelo Telegram");
	}
	
}
