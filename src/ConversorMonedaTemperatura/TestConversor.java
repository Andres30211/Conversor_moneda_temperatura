package ConversorMonedaTemperatura;

import javax.swing.JOptionPane;

public class TestConversor {

	public static void main(String[] args) {
		
		MenuPrincipal menu = new MenuPrincipal();
		String eleccionMenu = menu.MostrarMenu();
		
		if(eleccionMenu == "Conversor de moneda") {
			ConversorDeMoneda();
		}else if(eleccionMenu == "Conversor de temperatura") {
			ConversorDeTemperatura();
		}
		
	}
	
	public static void ConversorDeMoneda() {
		
		MenuPrincipal menu = new MenuPrincipal();
		
		String regex = "[a-z!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]";
		
		while(true) {
			String valorIngresado = menu.EntradaValor();
			try {
				if(valorIngresado.isEmpty() || valorIngresado.matches(".*"+regex+".*")) {
					JOptionPane.showMessageDialog(null, "Débes de ingresár valóres numéricos");
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
					
					JOptionPane.showMessageDialog(null, resultado);
					int confirmar = confirmaciones.DeseaContinuar();
					
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
				JOptionPane.showMessageDialog(null,e.getMessage()+" \nDébes de ingresár valóres numéricos");
			}
		}
		
	}
	
	public static void ConversorDeTemperatura() {
		
		MenuPrincipal menu = new MenuPrincipal();
		
		String regex = "[a-z!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]";
		
		while(true) {
			String valorIngresado = menu.EntradaTemperatura();
			try {
				if(valorIngresado.isEmpty() || valorIngresado.matches(".*"+regex+".*")) {
					JOptionPane.showMessageDialog(null, "Débes de ingresár valóres numéricos");
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
					
					JOptionPane.showMessageDialog(null, resultado);
					int confirmar = confirmaciones.DeseaContinuar();
					
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
				JOptionPane.showMessageDialog(null,e.getMessage()+" \nDébes de ingresár valóres numéricos");
			}
		
		}
	}
	
}
