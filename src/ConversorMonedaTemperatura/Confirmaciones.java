package ConversorMonedaTemperatura;

/**
 * Hacemos esta importación para utilizar la ventana de JoptionPane
 */
import javax.swing.JOptionPane;

/**
 * Esta clase la declaramos para especificar y lanzar un mensaje de confirmación 
 * @author Andrés Felipe López
 *
 */
public class Confirmaciones {
	
	/**
	 * Este es el mensaje que se mostrara en la ventana de JoptionPane, se declaro una varible como
	 * String privada
	 */
	private String mensaje= "¿Deséa Realizar otra conversión?";
	
	/**
	 * En este caso el constructor no tiene parametros
	 */
	public Confirmaciones() {
	}
	
	/**
	 * Esta es la función que retorna la venta para confirmar si deséa realizar otra conversión, no deséa realizar
	 * o cancelar
	 * @return
	 */
	public int DeseaContinuar() {
		return JOptionPane.showConfirmDialog(null, mensaje,"Confirmación",JOptionPane.YES_NO_CANCEL_OPTION);
	}

}
