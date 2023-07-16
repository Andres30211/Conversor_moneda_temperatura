package ConversorMonedaTemperatura;

/**
 * Importamos esta libreria para mostrar mensajes de confirmación durante el flujo de ejecución.
 */
import javax.swing.JOptionPane;

/**
 * Esta es la clase que contiene el método principal
 * @author Andrés Felipe López
 *
 */
public class TestConversor {

	/**
	 * Declaramos el metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Empezamos instanciando la clase menú principal para mostra las opciones de moneda
		 * o temperatura
		 */
		MenuPrincipal menu = new MenuPrincipal();
		String eleccionMenu = menu.MostrarMenu();
		
		if(eleccionMenu == "Conversor de moneda") {
			ConversorDeMoneda();
		}else if(eleccionMenu == "Conversor de temperatura") {
			ConversorDeTemperatura();
		}
		
	}
	
	/**
	 * Este es el método para usar el conversor de moneda, si arriba en el método
	 * principal escogemos el conversor de moneda en el condicional if se llamara este
	 * método 
	 */
	public static void ConversorDeMoneda() {
		
		/**
		 * Acá instanciamos la clase menú principal para mostrar las opciones
		 * de funciones que tenemos
		 */
		MenuPrincipal menu = new MenuPrincipal();
		
		/**
		 * Este String lo estamos declarando para recorrerlo en el bucle while y validar
		 * si estamos ingresando caracteres especiales
		 */
		String regex = "[a-z!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]";
		
		/**
		 * Estamos encerrando la logica de esta función en un bucle while para que séa
		 * repetitiva las acciones segun la elección del usuario
		 */
		while(true) {
			/**
			 * En esta variable estamos tomando el valor que ingresamos en una de las funciones de
			 * la clase menú principal
			 */
			String valorIngresado = menu.EntradaValor();
			/**
			 * Usamos el try catch para capturar cualquier tipo de error que se nos pueda
			 * presentar
			 */
			try {
				/**
				 * En este if estamos validando el ingreso de caracteres especiales
				 */
				if(valorIngresado.isEmpty() || valorIngresado.matches(".*"+regex+".*")) {
					JOptionPane.showMessageDialog(null, "Débes de ingresár valóres numéricos");
				/**
				 * En caso de que no se esten ingresando caracteres especiales ni letras
				 * se ejecutan las funciones que se escojan en el menú
				 */
				}else {
					String eleccionMoneda = menu.OpcionesMoneda();
					ConvertirDivisas convertir = new ConvertirDivisas();
					Confirmaciones confirmaciones = new Confirmaciones();
					double valorDinero = Double.parseDouble(valorIngresado);
					String resultado = "";
					
					switch (eleccionMoneda) {
						case "De pesos a Dólar":
							resultado = convertir.PesosDolares(valorDinero);
							break;
						case "De pesos a Euros":
							resultado = convertir.PesosEuros(valorDinero);
							break;
						case "De pesos a Libras esterlinas":
							resultado = convertir.PesosLibras(valorDinero);
							break;
						case "De pesos a Yen Japones":
							resultado = convertir.PesosYenJapones(valorDinero);
							break;
						case "De pesos a Won sul-Coreano":
							resultado = convertir.PesosSulCoreano(valorDinero);
							break;
						case "De Dólar a pesos":
							resultado = convertir.DolaresPesos(valorDinero);
							break;
						case "De Euros a pesos":
							resultado = convertir.EurosPesos(valorDinero);
							break;
						case "De Libras esterlinas a pesos":
							resultado = convertir.LibrasPesos(valorDinero);
							break;
						case "De Yen japones a pesos":
							resultado = convertir.YenPesos(valorDinero);
							break;
						case "De Won sul-coreano a pesos":
							resultado = convertir.WonSulPesos(valorDinero);
							break;
						default:
							break;
					}
					
					/**
					 * Segun la función seleccionada se mostrara el mensaje con el resultado
					 */
					JOptionPane.showMessageDialog(null, resultado);
					/**
					 * Con esta variable confirmar podemos finalizar el programa o
					 * seguir haciendo conversiones
					 */
					int confirmar = confirmaciones.DeseaContinuar();
					
					/**
					 * Esta es la validación de la varible confirmar
					 */
					if(confirmar == JOptionPane.YES_OPTION) {
						
					}else if(confirmar == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						break;
					}else if(confirmar == JOptionPane.CANCEL_OPTION) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						break;
					}
					
				}
			} catch (Exception e) {
				break;
				
			}
		}
		
	}
	
	/**
	 * Este es el método para usar el conversor de temperatura, si arriba en el método
	 * principal escogemos el conversor de temperatura en el condicional if se llamara este
	 * método 
	 */
	public static void ConversorDeTemperatura() {
		
		/**
		 * Acá instanciamos la clase menú principal para mostrar las opciones
		 * de funciones que tenemos
		 */
		MenuPrincipal menu = new MenuPrincipal();
		
		/**
		 * Este String lo estamos declarando para recorrerlo en el bucle while y validar
		 * si estamos ingresando caracteres especiales
		 */
		String regex = "[a-z!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]";
		
		/**
		 * Estamos encerrando la logica de esta función en un bucle while para que séa
		 * repetitiva las acciones segun la elección del usuario
		 */
		while(true) {
			/**
			 * En esta variable estamos tomando el valor que ingresamos en una de las funciones de
			 * la clase menú principal
			 */
			String valorIngresado = menu.EntradaTemperatura();
			/**
			 * Usamos el try catch para capturar cualquier tipo de error que se nos pueda
			 * presentar
			 */
			try {
				/**
				 * En este if estamos validando el ingreso de caracteres especiales
				 */
				if(valorIngresado.isEmpty() || valorIngresado.matches(".*"+regex+".*")) {
					JOptionPane.showMessageDialog(null, "Débes de ingresár valóres numéricos");
					/**
					 * En caso de que no se esten ingresando caracteres especiales ni letras
					 * se ejecutan las funciones que se escojan en el menú
					 */
				}else {
					String eleccionTemperatura = menu.OpcionesTemperatura();
					ConvertirTemperature convertir = new ConvertirTemperature();
					Confirmaciones confirmaciones = new Confirmaciones();
					double valorTemperatura = Double.parseDouble(valorIngresado);
					String resultado = "";
					
					switch (eleccionTemperatura) {
						case "De celsius a fahrenheit":
							resultado = convertir.celsiusFahrenheit(valorTemperatura);
							break;
						case "De celsius a kelvin":
							resultado = convertir.celsiusKelvin(valorTemperatura);
							break;
						case "De fahrenheit a celsius":
							resultado = convertir.fahrenheitCelsius(valorTemperatura);
							break;
						case "De fahrenheit a kelvin":
							resultado = convertir.fahrenheitKelvin(valorTemperatura);
							break;
						case "De kelvin a fahrenheit":
							resultado = convertir.kelvinCelsius(valorTemperatura);
							break;
						case "De kelvin a celsius":
							resultado = convertir.kelvinFahrenheit(valorTemperatura);
							break;
						default:
							break;
					}
					/**
					 * Segun la función seleccionada se mostrara el mensaje con el resultado
					 */
					JOptionPane.showMessageDialog(null, resultado);
					/**
					 * Con esta variable confirmar podemos finalizar el programa o
					 * seguir haciendo conversiones
					 */
					int confirmar = confirmaciones.DeseaContinuar();
					/**
					 * Esta es la validación de la varible confirmar
					 */
					if(confirmar == JOptionPane.YES_OPTION) {
						
					}else if(confirmar == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						break;
					}else if(confirmar == JOptionPane.CANCEL_OPTION) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						break;
					}
					
				}
			} catch (Exception e) {
				break;
			}
		
		}
	}
	
}
