package ConversorMonedaTemperatura;

import javax.swing.JOptionPane;

public class Confirmaciones {
	
	private String mensaje= "¿Deséa Realizar otra conversión?";
	
	public Confirmaciones() {
	}
	
	public int DeseaContinuar() {
		return JOptionPane.showConfirmDialog(null, mensaje,"Confirmación",JOptionPane.YES_NO_CANCEL_OPTION);
	}

}
