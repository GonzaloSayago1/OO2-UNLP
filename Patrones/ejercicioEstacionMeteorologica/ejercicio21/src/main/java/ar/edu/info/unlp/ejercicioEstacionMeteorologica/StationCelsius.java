package ar.edu.info.unlp.ejercicioEstacionMeteorologica;

public class StationCelsius extends HomeWeatherStation{
	
	@Override
	public double getTemperatura() {
		return ((super.getTemperatura() - 32) / 1.8);
	}

	@Override
	public String displayData() {
		return "Temperatura C: " + this.getTemperatura() +
			   	  "Presión atmosf: " + this.getPresion() +
			   	  "Radiación solar: " + this.getRadiacionSolar();

	}
}
