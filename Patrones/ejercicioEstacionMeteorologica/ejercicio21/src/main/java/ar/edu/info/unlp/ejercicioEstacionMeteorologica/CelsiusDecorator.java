package ar.edu.info.unlp.ejercicioEstacionMeteorologica;

public class CelsiusDecorator extends WeatherDecorator{

	public CelsiusDecorator(WeatherData weather) {
		super(weather);
	}
	
	private double getCelcius()
	{
		return (this.getTemperatura() - 32) / 1.8;
	}
	
	@Override
	public String displayData() {
		return super.displayData() 
	            + "; C: " + this.getCelcius();
	}
}
