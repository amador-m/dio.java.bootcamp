package javaBasico.Interfaces.multifuncional;

import javaBasico.Interfaces.copiadora.Copiadora;
import javaBasico.Interfaces.digitalizadora.Digitalizadora;
import javaBasico.Interfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
	}
	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
	}
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
	}

}
