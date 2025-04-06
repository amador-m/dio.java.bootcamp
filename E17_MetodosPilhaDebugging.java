package javaBasico;

public class E17_MetodosPilhaDebugging {
	public static void main(String[] args) {
		System.out.println("Início do método main");
		a();
		System.out.println("Fim do método main");
	}
	static void a() { //default public (public static void a) 
		System.out.println("\tInício do método a");
		b();
		System.out.println("\tFim do método a");
	}
	static void b() { //default public (public static void a) 
		System.out.println("\t\tInício do método b");
		for(int i=0;i<4;i++) {
			System.out.print(i+" ");
		}
		c();
		System.out.println("\t\tFim do método b");
	}
	static void c() { //default public (public static void a) 
		System.out.println("\n\t\t\tInício do método c");
		//Thread.dumpStack();
		System.out.println("\t\t\tFim do método c");
	}

}
