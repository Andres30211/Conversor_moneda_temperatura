package ConversorMonedaTemperatura;

public class ConvertirTemperature {
	
	public ConvertirTemperature() {
	}
	
	 public String celsiusFahrenheit(double celsius) {
	        return celsius+" grados celsius son: "+(celsius * 9 / 5) + 32+" grados fahrenheit";
    }

    public String celsiusKelvin(double celsius) {
        return celsius+" grados celsius son: "+(celsius + 273.15)+" grados kelvin";
    }

    public String fahrenheitCelsius(double fahrenheit) {
        return fahrenheit+" grados fahrenheit son:"+(fahrenheit - 32) * 5 / 9+" rados celsius";
    }

    public String fahrenheitKelvin(double fahrenheit) {
        return fahrenheit+" rados fahrenheit son: "+(fahrenheit + 459.67) * 5 / 9+" grados kelvin";
    }

    public String kelvinCelsius(double kelvin) {
        return kelvin+" grados kelvin son: "+(kelvin - 273.15)+" grados celsius";
    }

    public String kelvinFahrenheit(double kelvin) {
        return kelvin+" grados kelvin son: "+(kelvin * 9 / 5- 459.67)+" grados fahrenheit";
    }

}
