package main;

import modelo.Combo;
import modelo.ComboBasico;
import modelo.ComboFamiliar;
import modelo.PorcionCarne;
import modelo.PorcionPapas;
import modelo.PorcionQueso;

public class Main3 {

	public static void main(String[] args) {

		Combo miCombo = new ComboBasico(new PorcionCarne(new PorcionPapas(null)));
		miCombo.detallarDescripcion();
		System.out.println("Precio total del combo : $ " + miCombo.conocerMontoTotal() + "\n");

		Combo miCombo2 = new ComboFamiliar(
				new PorcionCarne(new PorcionPapas(new PorcionPapas(new PorcionQueso(null)))));
		miCombo2.detallarDescripcion();
		System.out.println("Precio total del combo : $ " + miCombo2.conocerMontoTotal() + "\n");

	}

}
