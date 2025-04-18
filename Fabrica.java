package javaBasico.Interfaces;

import javaBasico.Interfaces.impressora.Impressora;
import javaBasico.Interfaces.digitalizadora.Digitalizadora;
import javaBasico.Interfaces.copiadora.Copiadora;
import javaBasico.Interfaces.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}

}
