package ConversorMonedaTemperatura;

/**
 * De esta clase se despliegan todas las funciones de conversión para las divisas
 * @author Andrés Felipe López
 *
 */
public class ConvertirDivisas {
	
	/**
	 * En este caso para la conversión de divisas no se esta usando ninguna API
	 * estamos declarando variables para establecer la tasa de conversión de cada
	 * divisa que vamos a usar en este proyecto.
	 * 
	 * Despúes de que declaramos las variables declaramos los metodos con los que podemos hacer la conversión
	 * de divisas
	 */
	private double PesosDolar = 0.00024;
	private double PesosEuros = 0.00022;
	private double PesosLibraEsterlina = 0.00019;
	private double PesosYenJapones = 0.035;
	private double PesosWonSulCoreano = 0.31;
	
	private double DolarPesos = 4129.68;
	private double EuroPesos = 4483.39;
	private double LibraPesos = 5247.17;
	private double YenPesos = 28.57;
	private double WonSulCoreanoPesos = 3.17;
	
	public ConvertirDivisas() {
	}
	
	public String PesosDolares(double valorPesos) {
		
		double valorConvertido = valorPesos * PesosDolar;
		return valorPesos+" en pesos colombianos son: "+(double)Math.round(valorConvertido*100)/100+" Dólares";
	}
	
	public String PesosEuros(double valorPesos) {
			
			double valorConvertido = valorPesos * PesosEuros;
			return valorPesos+" en pesos colombianos son: "+(double)Math.round(valorConvertido*100)/100+" Euros";
	}

	public String PesosLibras(double valorPesos) {
			
			double valorConvertido = valorPesos * PesosLibraEsterlina;
			return valorPesos+" en pesos colombianos son: "+(double)Math.round(valorConvertido*100)/100+" Libras esterlinas";
	}
	
	public String PesosYenJapones(double valorPesos) {
			
			double valorConvertido = valorPesos * PesosYenJapones;
			return valorPesos+" en pesos colombianos son: "+(double)Math.round(valorConvertido*100)/100+" Won sul-coreano";
	}
	
	public String PesosSulCoreano(double valorPesos) {
		
		double valorConvertido = valorPesos * PesosWonSulCoreano;
		return valorPesos+" en pesos colombianos son: "+(double)Math.round(valorConvertido*100)/100+" Won sul-coreano";
	}
	
	public String DolaresPesos(double valorPesos) {
		
		double valorConvertido = valorPesos * DolarPesos;
		return valorPesos+" en Dólares son: "+(double)Math.round(valorConvertido*100)/100+" Pesos";
	}
	
	public String EurosPesos(double valorPesos) {
		
		double valorConvertido = valorPesos * EuroPesos;
		return valorPesos+" en Euros son: "+(double)Math.round(valorConvertido*100)/100+" Pesos";
	}
	
	public String LibrasPesos(double valorPesos) {
		
		double valorConvertido = valorPesos * LibraPesos;
		return valorPesos+" en Libras esterlinas son: "+(double)Math.round(valorConvertido*100)/100+" Pesos";
	}
	
	public String YenPesos(double valorPesos) {
		
		double valorConvertido = valorPesos * YenPesos;
		return valorPesos+" en Yen japones son: "+(double)Math.round(valorConvertido*100)/100+" Pesos";
	}
	
	public String WonSulPesos(double valorPesos) {
		
		double valorConvertido = valorPesos * WonSulCoreanoPesos;
		return valorPesos+" en Won sul coreano son: "+(double)Math.round(valorConvertido*100)/100+" Pesos";
	}
	
}
