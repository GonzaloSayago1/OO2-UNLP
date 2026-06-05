package ar.edu.info.unlp.Junio2025;

public abstract class ServicioDecorator implements IServicio{
	private IServicio paquete;

	public ServicioDecorator(IServicio paquete) {
		this.paquete = paquete;
	}
	
	protected IServicio getPaquete()
	{
		return this.paquete;
	}
	
	public String getDescripcion()
	{
		return this.paquete.getDescripcion() + this.agregarDescripcion();
	}
	
	public double getValorDeclarado()
	{
		return this.paquete.getValorDeclarado();
	}
	
	public double getCostoEnvio()
	{
		return this.paquete.getCostoEnvio() + this.sumarEnvio();
	}
	
	protected double sumarEnvio()
	{
		return 0;
	}
	
	protected String agregarDescripcion()
	{
		return "";
	}
}
