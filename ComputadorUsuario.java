package javaBasico.ServicoDeMensagens2;

public class ComputadorUsuario {
	public static void main(String[] args) {
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("\nFacebook");
		Facebook fcb = new Facebook();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("\nTelegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
 