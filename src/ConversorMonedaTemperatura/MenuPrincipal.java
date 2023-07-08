package ConversorMonedaTemperatura;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	private String[] opcionesMenu = {"Conversor de moneda","Conversor de temperatura"};
	
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
	
	private String[] opcionTemperatura = {"De celsius a fahrenheit",
											"De celsius a kelvin",
											"De fahrenheit a celsius",
											"De fahrenheit a kelvin",
											"De kelvin a fahrenheit",
											"De kelvin a celsius"};
	
	public MenuPrincipal() {
	}
	
	public String MostrarMenu() {
		
		return (String) JOptionPane.showInputDialog(null,"Escoja una opción de conversión","Menú",
																JOptionPane.QUESTION_MESSAGE,null,this.opcionesMenu,
																this.opcionesMenu[0]);
	}
	
	public String EntradaValor() {
		
		return JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero a convertir: ","Entrada de valor");
	}
	
	public String EntradaTemperatura() {
		
		return JOptionPane.showInputDialog(null,"Ingrese la temperatura a convertir: ","Entrada de valor");
	}
	
	public String OpcionesMoneda() {
		
		return (String) JOptionPane.showInputDialog(null,"Escoja una de las opciones","Menú",
																	JOptionPane.QUESTION_MESSAGE,null,this.opcionesMoneda,
																	this.opcionesMoneda[0]);
	}
	
	public String OpcionesTemperatura() {
		
		return (String) JOptionPane.showInputDialog(null,"Escoja una de las opciones","Menú",
																	JOptionPane.QUESTION_MESSAGE,null,this.opcionTemperatura,
																	this.opcionTemperatura[0]);
	}

}
