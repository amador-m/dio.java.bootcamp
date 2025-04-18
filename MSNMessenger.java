package javaBasico.ServicoDeMensagens3.Apps;

import javaBasico.ServicoDeMensagens3.ServicoDeMensagensPai;

public class MSNMessenger extends ServicoDeMensagensPai {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");	
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem feita pelo MSN");
	}

}
