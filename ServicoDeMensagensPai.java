package javaBasico.ServicoDeMensagens3;

// polimorfismo: permite que os objetos sejam tratados de maneira mais genérica
// trata objetos de classes diferentes uniformemente
// graças à herança, interfaces e métodos 
public abstract class ServicoDeMensagensPai {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// somente filhos conhecem esse método (os que tem extends)
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectaado a internet");
	}

}
