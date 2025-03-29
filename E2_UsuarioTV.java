package javaBasico;

public class E2_UsuarioTV {
	public static void main(String[] args) throws Exception{
		E1_SmartTV smartTV = new E1_SmartTV();
		
		System.out.println("TV ligada? "+smartTV.ligada);
		System.out.println("Volume: "+smartTV.volume);
		System.out.println("Canal: "+smartTV.canal);
		
		smartTV.ligar ();
		System.out.println("\nNovo status: \n\tTV ligada? "+smartTV.ligada);
		smartTV.desligar ();
		System.out.println("Novo status: \n\tTV ligada? "+smartTV.ligada);
		smartTV.aumentarVolume ();
		System.out.println("\nNovo status: \n\tVolume: "+smartTV.volume);
		smartTV.diminuirVolume ();
		System.out.println("Novo status: \n\tVolume: "+smartTV.volume);
		smartTV.aumentarCanal ();
		System.out.println("\nNovo status: \n\tCanal: "+smartTV.canal);
		smartTV.diminuirCanal ();
		System.out.println("Novo status: \n\tCanal: "+smartTV.canal);
		smartTV.escolherCanal ();
		System.out.println("Novo status: \n\tCanal: "+smartTV.canal);
		
		
		
	}

}
