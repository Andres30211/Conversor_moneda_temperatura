package ConversorMonedaTemperatura;

import javax.swing.JOptionPane;

/**
 * Esta clase MenuPrincipal lo que hace es contener para desplegar todos los menus de la aplicación.
 * @author Andrés Felipe López
 *
 */

public class MenuPrincipal {
	
	/**
	 * Este array muestra las opciones para empezar, ya sea con el conversor de moneda
	 * o con el de temperatura
	 */
	private String[] opcionesMenu = {"Conversor de moneda","Conversor de temperatura"};
	
	
	/**
	 * Este array muestra las opciones para el conversor de moneda
	 */
	private String[] opcionesMoneda = {"De pesos a Dólar",
										"De pesos a Euros",
										"De pesos a Libras esterlinas",
										"De pesos a Yen Japones",
										"De pesos a Won sul-Coreano",
										"De Dólar a pesos",
										"De Euros a pesos",
										"De Libras esterlinas a pesos",
										"De Yen japones a pesos",
										"De Won sul-coreano a pesos"};
	
	/**
	 * Este array muestra las opciones para el conversor de temperatura
	 */
	private String[] opcionTemperatura = {"De celsius a fahrenheit",
											"De celsius a kelvin",
											"De fahrenheit a celsius",
											"De fahrenheit a kelvin",
											"De kelvin a fahrenheit",
											"De kelvin a celsius"};
	
	/**
	 * Este es el constructor y no contiene parametros.
	 */
	public MenuPrincipal() {
	}
	
	
	/**
	 * Este es el metodo que retorna el array que contiene las opciones de conversor moneda
	 * o temperatura
	 * @return
	 */
	public String MostrarMenu() {
		
		return (String) JOptionPane.showInputDialog(null,"Escoja una opción de conversión","Menú",
																JOptionPane.QUESTION_MESSAGE,null,this.opcionesMenu,
																this.opcionesMenu[0]);
	}
	
	/**
	 * Con este metodo recivimos el valor a convertir divisas
	 * @return
	 */
	public String EntradaValor() {
		
		return JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero a convertir: ","Entrada de valor");
	}
	
	/**
	 * Con este metodo recivimos el valor a convertir temperatura
	 * @return
	 */
	public String EntradaTemperatura() {
		
		return JOptionPane.showInputDialog(null,"Ingrese la temperatura a convertir: ","Entrada de valor");
	}
	
	/**
	 * Este menu nos muestra las opciones de coversión de monedas
	 * @return
	 */
	public String OpcionesMoneda() {
		
		return (String) JOptionPane.showInputDialog(null,"Escoja una de las opciones","Menú",
																	JOptionPane.QUESTION_MESSAGE,null,this.opcionesMoneda,
																	this.opcionesMoneda[0]);
	}
	
	/**
	 * Este menu nos muestra las opciones de coversión de temperatura
	 * @return
	 */
	public String OpcionesTemperatura() {
		
		return (String) JOptionPane.showInputDialog(null,"Escoja una de las opciones","Menú",
																	JOptionPane.QUESTION_MESSAGE,null,this.opcionTemperatura,
																	this.opcionTemperatura[0]);
	}

}
